package com.micromanaged.oa.infrastructure.common;

import java.util.List;

public class ListViewModel<T> extends AbstractViewModel {

    public ListViewModel() {

    }

    public ListViewModel(List<T> items, int code, String msg) {
        super(code, msg);
        this.items = items;
    }

    private List<T> items;

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
