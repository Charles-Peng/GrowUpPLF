package pri.growup.constants.exception;


import pri.growup.exception.exceptions.GUBaseException;
import pri.growup.base.exception.BaseExceptionDM;

/**
 * The Class GUBusinessException
 * 业务错误类
 */
public class GUBusinessException extends GUBaseException {

    public GUBusinessException(BaseExceptionDM baseExceptionDM) {
        super(baseExceptionDM);
    }
}
