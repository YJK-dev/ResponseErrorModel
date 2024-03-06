package org.zerock.response_error_model.api.exception;

import java.util.Map;

public class CustomException extends RuntimeException {
    private final int errorCode;
    private Map<String, String> data = null;

    public CustomException(int errorCode, String message, Map<String, String> data) {
        super(message);
        this.errorCode = errorCode;
        this.data = data;
    }

    public CustomException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }


    public int getErrorCode() {
        return errorCode;
    }

    public Map<String, String> getData() {
        return data;
    }

    public CustomException(int errorCode, Map<String, String> data) {
        super();
        this.errorCode = errorCode;
        this.data = data;
    }

    public CustomException(String message, int errorCode, Map<String, String> data) {
        super(message);
        this.errorCode = errorCode;
        this.data = data;
    }

    public CustomException(String message, Throwable cause, int errorCode, Map<String, String> data) {
        super(message, cause);
        this.errorCode = errorCode;
        this.data = data;
    }

    public CustomException(Throwable cause, int errorCode, Map<String, String> data) {
        super(cause);
        this.errorCode = errorCode;
        this.data = data;
    }

    protected CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode, Map<String, String> data) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.data = data;
    }
}