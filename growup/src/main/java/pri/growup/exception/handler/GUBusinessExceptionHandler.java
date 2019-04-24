package pri.growup.exception.handler;

import pri.growup.base.domain.CommonDM;
import pri.growup.constants.exception.GUBusinessException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The Class GUBusinessExceptionHandler
 * 业务错误处理类
 *
 * @author PLF
 */
@ControllerAdvice
public class GUBusinessExceptionHandler {

    @ResponseBody
    @ExceptionHandler(GUBusinessException.class)
    public CommonDM handleException(GUBusinessException e) {
        CommonDM resultDM = new CommonDM();
        resultDM.setBaseExceptionDM(e.getBaseExceptionDM());
        return resultDM;
    }
}
