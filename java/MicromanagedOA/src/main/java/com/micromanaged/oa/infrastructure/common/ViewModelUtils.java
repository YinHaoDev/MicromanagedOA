package com.micromanaged.oa.infrastructure.common;

public final class ViewModelUtils {
    public static AbstractViewModel createSuccessOrError(boolean state, GlobalSuccessEnum success, GlobalErrorEnum error) {
        return state ? new SuccessViewModel(success.getMsg()) : new ErrorViewModel(error.getMsg());
    }

    public static AbstractViewModel createError(GlobalErrorEnum error) {
        return new ErrorViewModel(error.getMsg());
    }

    public static AbstractViewModel createSuccess(GlobalSuccessEnum success) {
        return new SuccessViewModel(success.getMsg());
    }

    public static <T> SingleViewModel<T> createSingleSuccessOrError(boolean state, T item, GlobalSuccessEnum success, GlobalErrorEnum error) {
        return state ? new SingleViewModel<>(item, success.getCode(), success.getMsg()) : new SingleViewModel<>(null, error.getCode(), error.getMsg());
    }
}
