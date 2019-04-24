package pri.growup.exception.exceptions;

import pri.growup.base.exception.BaseExceptionDM;

/**
 * The Class GUBaseException
 * 基本错误类
 *
 * @author PLF
 */
public class GUBaseException extends Exception {
    /**
     * 错误信息对象
     */
    private BaseExceptionDM baseExceptionDM;

    public GUBaseException(BaseExceptionDM baseExceptionDM) {
        super();
        this.baseExceptionDM = baseExceptionDM;
    }

    public BaseExceptionDM getBaseExceptionDM() {
        return baseExceptionDM;
    }

    public void setBaseExceptionDM(BaseExceptionDM baseExceptionDM) {
        this.baseExceptionDM = baseExceptionDM;
    }
}
