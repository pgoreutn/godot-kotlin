@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_pool_vector3_array_layout
import godot.internal.type.*
import kotlinx.cinterop.*

class PoolVector3Array : NativeCoreType<godot_pool_vector3_array_layout>, Iterable<Vector3> {
    //PROPERTIES
    val size: Int
        get() = this.size()


    //CONSTRUCTOR
    constructor() {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_new)(it)
        }
    }

    constructor(other: PoolVector3Array) {
        _handle = cValue{}
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_new_copy)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_pool_vector3_array_layout>) {
        memScoped {
            this@PoolVector3Array.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_pool_vector3_array_layout>().pointed.readValue()
    }


    //POOL ARRAY API SHARED
    /**
     * Appends an element at the end of the array (alias of push_back).
     */
    fun append(vector: Vector3) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_append)(it, vector.getRawMemory(this).reinterpret())
        }
    }


    /**
     * Appends a PoolVector3Array at the end of this array.
     */
    fun appendArray(array: PoolVector3Array) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_append_array)(it, array._handle.ptr)
        }
    }

    /**
     * Returns true if the array is empty.
     */
    fun empty() {
        callNative {
            nullSafe(Godot.gdnative12.godot_pool_vector3_array_empty)(it)
        }
    }

    /**
     *  Retrieve the element at the given index.
     */
    operator fun get(idx: Int): Vector3 {
        return Vector3(
            callNative {
                nullSafe(Godot.gdnative.godot_pool_vector3_array_get)(it, idx)
            }
        )
    }

    /**
     * Inserts a new element at a given position in the array.
     * The position must be valid, or at the end of the array (idx == size()).
     */
    fun insert(idx: Int, data: Vector3) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_insert)(it, idx, data.getRawMemory(this).reinterpret())
        }
    }

    /**
     * Reverses the order of the elements in the array.
     */
    fun invert() {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_invert)(it)
        }
    }

    /**
     * Appends a value to the array.
     */
    fun pushBack(data: Vector3) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_push_back)(it, data.getRawMemory(this).reinterpret())
        }
    }

    /**
     * Removes an element from the array by index.
     */
    fun remove(idx: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_remove)(it, idx)
        }
    }

    /**
     * Sets the size of the array. If the array is grown, reserves elements at the end of the array.
     * If the array is shrunk, truncates the array to the new size.
     */
    fun resize(size: Int) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_resize)(it, size)
        }
    }

    /**
     * Changes the vector at the given index.
     */
    operator fun set(idx: Int, data: Vector3) {
        callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_set)(it, idx, data.getRawMemory(this).reinterpret())
        }
    }

    /**
     * Returns the size of the array.
     */
    fun size(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_pool_vector3_array_size)(it)
        }
    }

    //UTILITIES
    override fun toVariant() = Variant(this)

    operator fun plus(other: Vector3) {
        this.append(other)
    }

    operator fun plus(other: PoolVector3Array) {
        this.appendArray(other)
    }

    override fun toString(): String {
        return "PoolVector3Array(${size()})"
    }

    override fun iterator(): Iterator<Vector3> {
        return IndexedIterator(size(), this::get)
    }

    /**
     * WARNING: no equals function is available in the Gdnative API for this Coretype.
     * This methods implementation works but is not the fastest one.
     */
    override fun equals(other: Any?): Boolean {
        return if (other is PoolVector3Array) {
            val list1 = this.toList()
            val list2 = other.toList()
            list1 == list2
        } else {
            false
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_pool_vector3_array_layout>) -> T): T {
        return callNative(this, block)
    }
}
