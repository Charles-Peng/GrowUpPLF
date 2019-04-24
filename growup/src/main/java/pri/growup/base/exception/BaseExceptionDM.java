package pri.growup.base.exception;

/**
 * The Class BaseExceptionDM
 *
 * 包装的错误信息类
 */
public class BaseExceptionDM {
    /**
     * 错误码
     */
    private String exceptionCode;

    /**
     * 错误信息
     */
    private String exceptionMess;

    public BaseExceptionDM(String exceptionCode, String exceptionMess) {
        this.exceptionCode = exceptionCode;
        this.exceptionMess = exceptionMess;
    }

    public String getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(String exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String getExceptionMess() {
        return exceptionMess;
    }

    public void setExceptionMess(String exceptionMess) {
        this.exceptionMess = exceptionMess;
    }
}
