package com.enroll.common;

/**
 * @Author:付风松
 * @Description:
 * @Date:Created in  10:32 2018/8/20
 * @ModefiedBy:
 */
public class BaseResult {

    private static final String OK = "ok";
    private static final String ERROR = "error";
    private  Meta meta;
    private Object data;
    public BaseResult() {

    }

    public BaseResult(Meta meta, Object data) {
        this.meta = meta;
        this.data = data;
    }

    public static BaseResult success() {
        Meta meta = new Meta(true, OK);
        return new BaseResult(meta,null);

    }

    public static BaseResult success(Object data) {
        Meta meta = new Meta(true, OK);
        return new BaseResult(meta,data);
    }

    public static BaseResult failure() {
        Meta meta = new Meta(false, ERROR);
        return new BaseResult(meta,null);
    }

    public static BaseResult failure(String message) {
        Meta meta = new Meta(false, message);
        return new BaseResult(meta,message);
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    static class Meta {
        private boolean success;
        private String message;

        public Meta(boolean success) {
            this.success = success;
        }

        public Meta(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }
}
