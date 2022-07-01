package com.micromanaged.oa.infrastructure.common;

public class ErrorViewModel extends AbstractViewModel {

    public ErrorViewModel(String msg) {
        super(1, msg);
    }

    public ErrorViewModel(int code, String msg) {
        super(code, msg);
    }
}
