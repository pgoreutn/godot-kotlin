// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Long
import godot.icalls._icall_OccluderPolygon2D
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class LightOccluder2D : Node2D() {
  override var lightMask: Long
    get() {
      val mb = getMethodBind("LightOccluder2D","get_occluder_light_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LightOccluder2D","set_occluder_light_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var occluder: OccluderPolygon2D
    get() {
      val mb = getMethodBind("LightOccluder2D","get_occluder_polygon")
      return _icall_OccluderPolygon2D(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("LightOccluder2D","set_occluder_polygon")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("LightOccluder2D", "LightOccluder2D")

  open fun _polyChanged() {
  }

  open fun getOccluderLightMask(): Long {
    val mb = getMethodBind("LightOccluder2D","get_occluder_light_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getOccluderPolygon(): OccluderPolygon2D {
    val mb = getMethodBind("LightOccluder2D","get_occluder_polygon")
    return _icall_OccluderPolygon2D( mb, this.ptr)
  }

  open fun setOccluderLightMask(mask: Long) {
    val mb = getMethodBind("LightOccluder2D","set_occluder_light_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setOccluderPolygon(polygon: OccluderPolygon2D) {
    val mb = getMethodBind("LightOccluder2D","set_occluder_polygon")
    _icall_Unit_Object( mb, this.ptr, polygon)
  }
}
