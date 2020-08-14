// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_String
import godot.icalls._icall_Unit_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.String

open class VideoStreamTheora internal constructor(
  _ignore: Any?
) : VideoStream(_ignore) {
  open var file: String
    get() {
      val mb = getMethodBind("VideoStreamTheora","get_file")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VideoStreamTheora","set_file")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("VideoStreamTheora", "VideoStreamTheora")
        }

  }

  open fun getFile(): String {
    val mb = getMethodBind("VideoStreamTheora","get_file")
    return _icall_String( mb, this.ptr)
  }

  open fun setFile(file: String) {
    val mb = getMethodBind("VideoStreamTheora","set_file")
    _icall_Unit_String( mb, this.ptr, file)
  }
}