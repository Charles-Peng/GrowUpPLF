package pri.growup.base.service;

import pri.growup.base.domain.BaseDM;
import pri.growup.base.exception.BaseExceptionDM;
import pri.growup.constants.enums.ExceptionCode;
import pri.growup.constants.exception.GUBusinessException;
import pri.growup.util.MessageUtils;

/**
 * The Class BaseService
 * service基础类
 */

public abstract class BaseService<T extends BaseDM> {
    /**
     * 检查参数
     *
     * @return 错误列表
     */
    protected abstract ExceptionCode checkParams(T t);

    /**
     * 处理业务错误码
     *
     * @param exceptionCode 错误码枚举
     * @throws GUBusinessException 业务错误
     */
    protected void businessExcptionHandle(ExceptionCode exceptionCode) throws GUBusinessException {
        if (exceptionCode != null) {
            throw new GUBusinessException(new BaseExceptionDM(exceptionCode.getExceptionCode(),
                    MessageUtils.getExcptionMessage(exceptionCode.getExceptionMess())));
        }
    }
}
