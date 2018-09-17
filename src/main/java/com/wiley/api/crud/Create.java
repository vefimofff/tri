package com.wiley.api.crud;

/**
 * Base abstraction for adding item
 */
public interface Create<T> {
    void create(T item);
}
