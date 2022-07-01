package com.micromanaged.oa.infrastructure.common;

public class SuccessViewModel extends AbstractViewModel {

    public SuccessViewModel(String msg) {
        super(0, msg);
    }

    public SuccessViewModel(int code, String msg) {
        super(code, msg);
    }
}
