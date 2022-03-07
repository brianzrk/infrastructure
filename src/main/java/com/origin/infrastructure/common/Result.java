package com.origin.infrastructure.common;

import lombok.Data;

@Data
public class Result<T> {

    private String code;

    private String msg;

    private T payload;

    public Result(String code, String msg, T payload) {
        this.code = code;
        this.msg = msg;
        this.payload = payload;
    }

    public static <T> Result<T> ok() {
        return new Result<>("200", "操作成功", null);
    }

    public static <T> Result<T> ok(T payload) {
        return new Result<>("200", "操作成功", payload);
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>("400", msg, null);
    }

    public static <T> Result<T> fail(String code, String msg) {
        return new Result<>(code, msg, null);
    }

}