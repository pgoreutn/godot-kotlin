// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AudioEffectDistortion
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class AudioEffectDistortion : AudioEffect() {
  open var drive: Double
    get() {
      val mb = getMethodBind("AudioEffectDistortion","get_drive")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDistortion","set_drive")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var keepHfHz: Double
    get() {
      val mb = getMethodBind("AudioEffectDistortion","get_keep_hf_hz")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDistortion","set_keep_hf_hz")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var mode: Long
    get() {
      val mb = getMethodBind("AudioEffectDistortion","get_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDistortion","set_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var postGain: Double
    get() {
      val mb = getMethodBind("AudioEffectDistortion","get_post_gain")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDistortion","set_post_gain")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var preGain: Double
    get() {
      val mb = getMethodBind("AudioEffectDistortion","get_pre_gain")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AudioEffectDistortion","set_pre_gain")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("AudioEffectDistortion",
      "AudioEffectDistortion")

  open fun getDrive(): Double {
    val mb = getMethodBind("AudioEffectDistortion","get_drive")
    return _icall_Double( mb, this.ptr)
  }

  open fun getKeepHfHz(): Double {
    val mb = getMethodBind("AudioEffectDistortion","get_keep_hf_hz")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMode(): AudioEffectDistortion.Mode {
    val mb = getMethodBind("AudioEffectDistortion","get_mode")
    return AudioEffectDistortion.Mode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPostGain(): Double {
    val mb = getMethodBind("AudioEffectDistortion","get_post_gain")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPreGain(): Double {
    val mb = getMethodBind("AudioEffectDistortion","get_pre_gain")
    return _icall_Double( mb, this.ptr)
  }

  open fun setDrive(drive: Double) {
    val mb = getMethodBind("AudioEffectDistortion","set_drive")
    _icall_Unit_Double( mb, this.ptr, drive)
  }

  open fun setKeepHfHz(keepHfHz: Double) {
    val mb = getMethodBind("AudioEffectDistortion","set_keep_hf_hz")
    _icall_Unit_Double( mb, this.ptr, keepHfHz)
  }

  open fun setMode(mode: Long) {
    val mb = getMethodBind("AudioEffectDistortion","set_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setPostGain(postGain: Double) {
    val mb = getMethodBind("AudioEffectDistortion","set_post_gain")
    _icall_Unit_Double( mb, this.ptr, postGain)
  }

  open fun setPreGain(preGain: Double) {
    val mb = getMethodBind("AudioEffectDistortion","set_pre_gain")
    _icall_Unit_Double( mb, this.ptr, preGain)
  }

  enum class Mode(
    id: Long
  ) {
    MODE_CLIP(0),

    MODE_ATAN(1),

    MODE_LOFI(2),

    MODE_OVERDRIVE(3),

    MODE_WAVESHAPE(4);

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
