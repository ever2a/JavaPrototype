package com.cerberuz.prototype;

@SuppressWarnings("rawtypes")
public interface IPrototype<T extends IPrototype> extends Cloneable {
    // Clonación simple - simple clone
    public T simpleClone();

    // Clonación profunda - deep clone
    public T deepClone();
}
