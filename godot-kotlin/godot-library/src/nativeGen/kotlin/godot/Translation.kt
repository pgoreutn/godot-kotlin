// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.PoolStringArray
import godot.icalls._icall_Long
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class Translation : Resource() {
  open var locale: String
    get() {
      val mb = getMethodBind("Translation","get_locale")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Translation","set_locale")
      _icall_Unit_String(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("Translation", "Translation")

  open fun _getMessages(): PoolStringArray {
    throw NotImplementedError("_get_messages is not implemented for Translation")
  }

  open fun _setMessages(arg0: PoolStringArray) {
  }

  open fun addMessage(srcMessage: String, xlatedMessage: String) {
    val mb = getMethodBind("Translation","add_message")
    _icall_Unit_String_String( mb, this.ptr, srcMessage, xlatedMessage)
  }

  open fun eraseMessage(srcMessage: String) {
    val mb = getMethodBind("Translation","erase_message")
    _icall_Unit_String( mb, this.ptr, srcMessage)
  }

  open fun getLocale(): String {
    val mb = getMethodBind("Translation","get_locale")
    return _icall_String( mb, this.ptr)
  }

  open fun getMessage(srcMessage: String): String {
    val mb = getMethodBind("Translation","get_message")
    return _icall_String_String( mb, this.ptr, srcMessage)
  }

  open fun getMessageCount(): Long {
    val mb = getMethodBind("Translation","get_message_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMessageList(): PoolStringArray {
    val mb = getMethodBind("Translation","get_message_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun setLocale(locale: String) {
    val mb = getMethodBind("Translation","set_locale")
    _icall_Unit_String( mb, this.ptr, locale)
  }
}
