// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.internal.utils.invokeConstructor
import kotlin.Any

open class HSplitContainer internal constructor(
  _ignore: Any?
) : SplitContainer(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("HSplitContainer", "HSplitContainer")
        }

  }
}