// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class EditorInspector internal constructor() : ScrollContainer() {
  val objectIdSelected: Signal1<Long> by signal("id")

  val propertyEdited: Signal1<String> by signal("property")

  val propertyKeyed: Signal1<String> by signal("property")

  val propertySelected: Signal1<String> by signal("property")

  val propertyToggled: Signal2<String, Boolean> by signal("property", "checked")

  val resourceSelected: Signal2<Object, String> by signal("res", "prop")

  val restartRequested: Signal0 by signal()

  open fun _editRequestChange(arg0: Object, arg1: String) {
  }

  open fun _featureProfileChanged() {
  }

  open fun _filterChanged(arg0: String) {
  }

  open fun _multiplePropertiesChanged(arg0: PoolStringArray, arg1: VariantArray) {
  }

  open fun _nodeRemoved(arg0: Node) {
  }

  open fun _objectIdSelected(arg0: String, arg1: Long) {
  }

  open fun _propertyChanged(
    arg0: String,
    arg1: Variant,
    arg2: String = "",
    arg3: Boolean = false
  ) {
  }

  open fun _propertyChangedUpdateAll(
    arg0: String,
    arg1: Variant,
    arg2: String,
    arg3: Boolean
  ) {
  }

  open fun _propertyChecked(arg0: String, arg1: Boolean) {
  }

  open fun _propertyKeyed(arg0: String, arg1: Boolean) {
  }

  open fun _propertyKeyedWithValue(
    arg0: String,
    arg1: Variant,
    arg2: Boolean
  ) {
  }

  open fun _propertySelected(arg0: String, arg1: Long) {
  }

  open fun _resourceSelected(arg0: String, arg1: Resource) {
  }

  open fun _vscrollChanged(arg0: Double) {
  }

  open fun refresh() {
    val mb = getMethodBind("EditorInspector","refresh")
    _icall_Unit( mb, this.ptr)
  }
}
