package com.wiley.api.crud;

/**
 * Base abstraction for updating item
 */
public interface Update<T> {
    void update(T item);
}
