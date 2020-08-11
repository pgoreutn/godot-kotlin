package godot.core

import godot.gdnative.godot_pool_real_array
import godot.internal.type.*
import godot.internal.utils.GodotScope
import kotlinx.cinterop.*

class PoolRealArray : NativeCoreType<godot_pool_real_array>, Iterable<KotlinReal> {
    override var _handle =
        cValue<godot_pool_real_array> {}

    //PROPERTIES
    val size: Int
        get() = callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_size)(it)
        }

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_new)(it)
        }
    }

    internal constructor(native: CValue<godot_pool_real_array>) {
        setRawMemory(native)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_pool_real_array> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_pool_real_array>) {
        _handle = value
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(real: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_append)(it, real.toGodotReal())
        }
    }


    /**
     * Appends a PoolRealArray at the end of this array.
     */
    fun appendArray(array: PoolRealArray) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_append_array)(it, array.ptr)
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        callNative {
            nullSafe(Godot.gdnative12.godot_pool_real_array_empty)(it)
        }
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): KotlinReal {
        return callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_get)(it, idx)
        }.toKotlinReal()
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_insert)(it, idx, data.toGodotReal())
        }
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_invert)(it)
        }
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_push_back)(it, data.toGodotReal())
        }
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_remove)(it, idx)
        }
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_resize)(it, size)
        }
    }

    /**
     * Changes the real at the given index.
     */
    operator fun set(idx: Int, data: KotlinReal) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_real_array_set)(it, idx, data.toGodotReal())
        }
    }

    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun plus(other: KotlinReal) {
        this.append(other)
    }

    operator fun plus(other: PoolRealArray) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolRealArray(${size})"
    }

    override fun iterator(): Iterator<KotlinReal> {
        return IndexedIterator(this::size, this::get, this::remove)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolRealArray) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return hashCode()
    }

    internal inline fun <T> callNative(block: GodotScope.(CPointer<godot_pool_real_array>) -> T): T {
        return godot.internal.type.callNative(this, block)
    }
}