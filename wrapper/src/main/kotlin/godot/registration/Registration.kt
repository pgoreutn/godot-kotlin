package godot.registration

import godot.core.Godot
import godot.core.Variant
import godot.core.toGDString
import godot.gdnative.*
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer


fun registerClass(cl: String, base: String,
                  cons: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>,
                  dest: CPointer<CFunction<(COpaquePointer?) -> Unit>>)
{
    godot_wrapper_register_class(cl, base, cons, dest)
}


fun registerMethod(cl: String, m: String,
                   impl: CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>>,
                   rpc: godot_method_rpc_mode = godot_method_rpc_mode.GODOT_METHOD_RPC_MODE_DISABLED)
{
    godot_wrapper_register_method(cl, m, impl, rpc)
}


fun registerProperty(cl: String,
                     n: String,
                     e: Boolean,
                     g: CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>>,
                     s: CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>>,
                     dv: Variant,
                     r: godot_method_rpc_mode = godot_method_rpc_mode.GODOT_METHOD_RPC_MODE_DISABLED,
                     uu: godot_property_usage_flags = GODOT_PROPERTY_USAGE_NOEDITOR,
                     hh: godot_property_hint = godot_property_hint.GODOT_PROPERTY_HINT_NONE,
                     hss: String = "")
{
    var u = uu or GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE
    var h = hh
    var hs = hss

    if (e) {
        u = u or GODOT_PROPERTY_USAGE_EDITOR

        if (dv.getType() == Variant.Type.OBJECT) {
            val isResource = dv.call("is_class", arrayOf(Variant("Resource"))).toBoolean()

            if (isResource) {
                h = godot_property_hint.byValue(hh.value or godot_property_hint.GODOT_PROPERTY_HINT_RESOURCE_TYPE.value)
                hs = dv.call("get_class", arrayOf()).toString()
            }
        }
    }
    godot_wrapper_register_property(cl, n, g, s, dv.nativeValue, dv.getType().id, r, u, h, hs.toGDString())
}