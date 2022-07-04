package com.micromanaged.oa.infrastructure.common;

import java.util.List;

public final class ViewModelUtils {
    public static AbstractViewModel createSuccessOrError(boolean state, GlobalSuccessEnum success, GlobalErrorEnum error) {
        return state ? new SuccessViewModel(success.getMsg()) : new ErrorViewModel(error.getMsg());
    }

    public static AbstractViewModel error(GlobalErrorEnum error) {
        return new ErrorViewModel(error.getMsg());
    }

    public static AbstractViewModel success(GlobalSuccessEnum success) {
        return new SuccessViewModel(success.getMsg());
    }

    public static <T> SingleViewModel<T> singleView(boolean state, T item, GlobalSuccessEnum success, GlobalErrorEnum error) {
        return state ? new SingleViewModel<>(item, success.getCode(), success.getMsg()) : new SingleViewModel<>(null, error.getCode(), error.getMsg());
    }

    public static <T> ListViewModel<T> listView(boolean state, List<T> items, GlobalSuccessEnum success, GlobalErrorEnum error) {
        return state ? new ListViewModel<>(items, 0, success.getMsg()) : new ListViewModel<>(items, error.getCode(), error.getMsg());
    }
}
