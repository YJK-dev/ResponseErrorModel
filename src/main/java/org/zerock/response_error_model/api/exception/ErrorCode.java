package org.zerock.response_error_model.api.exception;

public enum ErrorCode {
    NAME_NOT_FOUND(4001, "이름을 찾을 수 없음"),
    INVALID_GRADE(4011, "1이상 5이하의 등급만 입력 가능함"),
    GRADE_NOT_FOUND(4002, "등급을 찾을 수 없음"),
    INFO_NOT_FOUND(4003, "입력 정보를 찾을 수 없음"),
    EMPTY_STUDENT(4004, "등록된 학생이 없음"),
    INTERNAL_SERVER_ERROR(500, "비상");

    private final int code;
    private final String errorMessage;

    ErrorCode(int code, String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public int getCode() {
        return code;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
}