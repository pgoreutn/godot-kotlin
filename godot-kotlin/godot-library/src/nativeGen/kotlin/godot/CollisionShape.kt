// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Boolean
import godot.icalls._icall_Shape
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlinx.cinterop.COpaquePointer

open class CollisionShape : Spatial() {
  open var disabled: Boolean
    get() {
      val mb = getMethodBind("CollisionShape","is_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionShape","set_disabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var shape: Shape
    get() {
      val mb = getMethodBind("CollisionShape","get_shape")
      return _icall_Shape(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionShape","set_shape")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("CollisionShape", "CollisionShape")

  open fun _shapeChanged() {
  }

  open fun _updateDebugShape() {
  }

  open fun getShape(): Shape {
    val mb = getMethodBind("CollisionShape","get_shape")
    return _icall_Shape( mb, this.ptr)
  }

  open fun isDisabled(): Boolean {
    val mb = getMethodBind("CollisionShape","is_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun makeConvexFromBrothers() {
    val mb = getMethodBind("CollisionShape","make_convex_from_brothers")
    _icall_Unit( mb, this.ptr)
  }

  open fun resourceChanged(resource: Resource) {
    val mb = getMethodBind("CollisionShape","resource_changed")
    _icall_Unit_Object( mb, this.ptr, resource)
  }

  open fun setDisabled(enable: Boolean) {
    val mb = getMethodBind("CollisionShape","set_disabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setShape(shape: Shape) {
    val mb = getMethodBind("CollisionShape","set_shape")
    _icall_Unit_Object( mb, this.ptr, shape)
  }
}
