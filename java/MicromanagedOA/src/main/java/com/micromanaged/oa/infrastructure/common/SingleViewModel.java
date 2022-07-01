package com.micromanaged.oa.infrastructure.common;

public class SingleViewModel<T> extends AbstractViewModel {

    public SingleViewModel() {

    }

    public SingleViewModel(T item, int code, String msg) {
        super(code, msg);
        this.item = item;
    }

    public SingleViewModel(T item) {
        super();
        this.item = item;
    }

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
