package pri.growup.constants.enums;

public enum ExceptionCode {
    USER_NAME_OR_PWD_IS_WRONG("GUB0001", "user.name.or.pwd.is.wrong"),
    USER_NAME_OR_PWD_CAN_NOT_EMPTY("GUB0002", "user.name.or.pwd.can.not.empty"),
    USER_NAME_CAN_NOT_EMPTY("GUB0003", "user.name.can.not.empty"),
    USER_PWD_CAN_NOT_EMPTY("GUB0004", "user.pwd.can.not.empty"),
    PHONE_CAN_NOT_EMPTY("GUB0005", "phone.can.not.empty");

    private String exceptionCode;

    private String exceptionMess;

    ExceptionCode(String exceptionCode, String exceptionMess) {
        this.exceptionCode = exceptionCode;
        this.exceptionMess = exceptionMess;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public String getExceptionMess() {
        return exceptionMess;
    }
}
