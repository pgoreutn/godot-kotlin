// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Area
import godot.core.RID
import godot.core.Signal1
import godot.core.Signal4
import godot.core.VariantArray
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Boolean_Object
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_VariantArray
import godot.icalls._icall_Vector3
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.COpaquePointer

open class Area : CollisionObject() {
  val areaEntered: Signal1<Area> by signal("area")

  val areaExited: Signal1<Area> by signal("area")

  val areaShapeEntered: Signal4<Long, Area, Long, Long> by signal("area_id", "area", "area_shape",
      "self_shape")

  val areaShapeExited: Signal4<Long, Area, Long, Long> by signal("area_id", "area", "area_shape",
      "self_shape")

  val bodyEntered: Signal1<Node> by signal("body")

  val bodyExited: Signal1<Node> by signal("body")

  val bodyShapeEntered: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "area_shape")

  val bodyShapeExited: Signal4<Long, Node, Long, Long> by signal("body_id", "body", "body_shape",
      "area_shape")

  open var angularDamp: Double
    get() {
      val mb = getMethodBind("Area","get_angular_damp")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_angular_damp")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var audioBusName: String
    get() {
      val mb = getMethodBind("Area","get_audio_bus")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_audio_bus")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var audioBusOverride: Boolean
    get() {
      val mb = getMethodBind("Area","is_overriding_audio_bus")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_audio_bus_override")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("Area","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("Area","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var gravity: Double
    get() {
      val mb = getMethodBind("Area","get_gravity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_gravity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gravityDistanceScale: Double
    get() {
      val mb = getMethodBind("Area","get_gravity_distance_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_gravity_distance_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var gravityPoint: Boolean
    get() {
      val mb = getMethodBind("Area","is_gravity_a_point")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_gravity_is_point")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var gravityVec: Vector3
    get() {
      val mb = getMethodBind("Area","get_gravity_vector")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_gravity_vector")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var linearDamp: Double
    get() {
      val mb = getMethodBind("Area","get_linear_damp")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_linear_damp")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var monitorable: Boolean
    get() {
      val mb = getMethodBind("Area","is_monitorable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_monitorable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var monitoring: Boolean
    get() {
      val mb = getMethodBind("Area","is_monitoring")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_monitoring")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var priority: Double
    get() {
      val mb = getMethodBind("Area","get_priority")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_priority")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var reverbBusAmount: Double
    get() {
      val mb = getMethodBind("Area","get_reverb_amount")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_reverb_amount")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var reverbBusEnable: Boolean
    get() {
      val mb = getMethodBind("Area","is_using_reverb_bus")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_use_reverb_bus")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var reverbBusName: String
    get() {
      val mb = getMethodBind("Area","get_reverb_bus")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_reverb_bus")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var reverbBusUniformity: Double
    get() {
      val mb = getMethodBind("Area","get_reverb_uniformity")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_reverb_uniformity")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var spaceOverride: Long
    get() {
      val mb = getMethodBind("Area","get_space_override_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Area","set_space_override_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Area", "Area")

  open fun gravityVec(schedule: Vector3.() -> Unit): Vector3 = gravityVec.apply{
      schedule(this)
      gravityVec = this
  }


  open fun _areaEnterTree(id: Long) {
  }

  open fun _areaExitTree(id: Long) {
  }

  open fun _areaInout(
    arg0: Long,
    arg1: RID,
    arg2: Long,
    arg3: Long,
    arg4: Long
  ) {
  }

  open fun _bodyEnterTree(id: Long) {
  }

  open fun _bodyExitTree(id: Long) {
  }

  open fun _bodyInout(
    arg0: Long,
    arg1: RID,
    arg2: Long,
    arg3: Long,
    arg4: Long
  ) {
  }

  open fun getAngularDamp(): Double {
    val mb = getMethodBind("Area","get_angular_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getAudioBus(): String {
    val mb = getMethodBind("Area","get_audio_bus")
    return _icall_String( mb, this.ptr)
  }

  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("Area","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    val mb = getMethodBind("Area","get_collision_layer_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("Area","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("Area","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getGravity(): Double {
    val mb = getMethodBind("Area","get_gravity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGravityDistanceScale(): Double {
    val mb = getMethodBind("Area","get_gravity_distance_scale")
    return _icall_Double( mb, this.ptr)
  }

  open fun getGravityVector(): Vector3 {
    val mb = getMethodBind("Area","get_gravity_vector")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getLinearDamp(): Double {
    val mb = getMethodBind("Area","get_linear_damp")
    return _icall_Double( mb, this.ptr)
  }

  open fun getOverlappingAreas(): VariantArray {
    val mb = getMethodBind("Area","get_overlapping_areas")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getOverlappingBodies(): VariantArray {
    val mb = getMethodBind("Area","get_overlapping_bodies")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getPriority(): Double {
    val mb = getMethodBind("Area","get_priority")
    return _icall_Double( mb, this.ptr)
  }

  open fun getReverbAmount(): Double {
    val mb = getMethodBind("Area","get_reverb_amount")
    return _icall_Double( mb, this.ptr)
  }

  open fun getReverbBus(): String {
    val mb = getMethodBind("Area","get_reverb_bus")
    return _icall_String( mb, this.ptr)
  }

  open fun getReverbUniformity(): Double {
    val mb = getMethodBind("Area","get_reverb_uniformity")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSpaceOverrideMode(): Area.SpaceOverride {
    val mb = getMethodBind("Area","get_space_override_mode")
    return Area.SpaceOverride.from( _icall_Long( mb, this.ptr))
  }

  open fun isGravityAPoint(): Boolean {
    val mb = getMethodBind("Area","is_gravity_a_point")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isMonitorable(): Boolean {
    val mb = getMethodBind("Area","is_monitorable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isMonitoring(): Boolean {
    val mb = getMethodBind("Area","is_monitoring")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOverridingAudioBus(): Boolean {
    val mb = getMethodBind("Area","is_overriding_audio_bus")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingReverbBus(): Boolean {
    val mb = getMethodBind("Area","is_using_reverb_bus")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun overlapsArea(area: Node): Boolean {
    val mb = getMethodBind("Area","overlaps_area")
    return _icall_Boolean_Object( mb, this.ptr, area)
  }

  open fun overlapsBody(body: Node): Boolean {
    val mb = getMethodBind("Area","overlaps_body")
    return _icall_Boolean_Object( mb, this.ptr, body)
  }

  open fun setAngularDamp(angularDamp: Double) {
    val mb = getMethodBind("Area","set_angular_damp")
    _icall_Unit_Double( mb, this.ptr, angularDamp)
  }

  open fun setAudioBus(name: String) {
    val mb = getMethodBind("Area","set_audio_bus")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setAudioBusOverride(enable: Boolean) {
    val mb = getMethodBind("Area","set_audio_bus_override")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollisionLayer(collisionLayer: Long) {
    val mb = getMethodBind("Area","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, collisionLayer)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("Area","set_collision_layer_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionMask(collisionMask: Long) {
    val mb = getMethodBind("Area","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, collisionMask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("Area","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setGravity(gravity: Double) {
    val mb = getMethodBind("Area","set_gravity")
    _icall_Unit_Double( mb, this.ptr, gravity)
  }

  open fun setGravityDistanceScale(distanceScale: Double) {
    val mb = getMethodBind("Area","set_gravity_distance_scale")
    _icall_Unit_Double( mb, this.ptr, distanceScale)
  }

  open fun setGravityIsPoint(enable: Boolean) {
    val mb = getMethodBind("Area","set_gravity_is_point")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setGravityVector(vector: Vector3) {
    val mb = getMethodBind("Area","set_gravity_vector")
    _icall_Unit_Vector3( mb, this.ptr, vector)
  }

  open fun setLinearDamp(linearDamp: Double) {
    val mb = getMethodBind("Area","set_linear_damp")
    _icall_Unit_Double( mb, this.ptr, linearDamp)
  }

  open fun setMonitorable(enable: Boolean) {
    val mb = getMethodBind("Area","set_monitorable")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setMonitoring(enable: Boolean) {
    val mb = getMethodBind("Area","set_monitoring")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setPriority(priority: Double) {
    val mb = getMethodBind("Area","set_priority")
    _icall_Unit_Double( mb, this.ptr, priority)
  }

  open fun setReverbAmount(amount: Double) {
    val mb = getMethodBind("Area","set_reverb_amount")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setReverbBus(name: String) {
    val mb = getMethodBind("Area","set_reverb_bus")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setReverbUniformity(amount: Double) {
    val mb = getMethodBind("Area","set_reverb_uniformity")
    _icall_Unit_Double( mb, this.ptr, amount)
  }

  open fun setSpaceOverrideMode(enable: Long) {
    val mb = getMethodBind("Area","set_space_override_mode")
    _icall_Unit_Long( mb, this.ptr, enable)
  }

  open fun setUseReverbBus(enable: Boolean) {
    val mb = getMethodBind("Area","set_use_reverb_bus")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class SpaceOverride(
    id: Long
  ) {
    SPACE_OVERRIDE_DISABLED(0),

    SPACE_OVERRIDE_COMBINE(1),

    SPACE_OVERRIDE_COMBINE_REPLACE(2),

    SPACE_OVERRIDE_REPLACE(3),

    SPACE_OVERRIDE_REPLACE_COMBINE(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
