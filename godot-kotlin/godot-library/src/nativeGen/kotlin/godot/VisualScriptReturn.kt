// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Variant
import godot.core.Variant.Type
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class VisualScriptReturn : VisualScriptNode() {
  open var returnEnabled: Boolean
    get() {
      val mb = getMethodBind("VisualScriptReturn","is_return_value_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptReturn","set_enable_return_value")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var returnType: Long
    get() {
      val mb = getMethodBind("VisualScriptReturn","get_return_type")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualScriptReturn","set_return_type")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("VisualScriptReturn",
      "VisualScriptReturn")

  open fun getReturnType(): Variant.Type {
    val mb = getMethodBind("VisualScriptReturn","get_return_type")
    return Variant.Type.from( _icall_Long( mb, this.ptr))
  }

  open fun isReturnValueEnabled(): Boolean {
    val mb = getMethodBind("VisualScriptReturn","is_return_value_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setEnableReturnValue(enable: Boolean) {
    val mb = getMethodBind("VisualScriptReturn","set_enable_return_value")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setReturnType(type: Long) {
    val mb = getMethodBind("VisualScriptReturn","set_return_type")
    _icall_Unit_Long( mb, this.ptr, type)
  }
}
