package pri.growup.base.domain;

import pri.growup.base.exception.BaseExceptionDM;

/**
 * The Class CommonDM
 *
 * 公共的返回给前端的对象
 */
public class CommonDM {

    /**
     * 错误信息对象
     */
    private BaseExceptionDM baseExceptionDM;

    /**
     * 返回数据信息
     */
    private Object data;

    public BaseExceptionDM getBaseExceptionDM() {
        return baseExceptionDM;
    }

    public void setBaseExceptionDM(BaseExceptionDM baseExceptionDM) {
        this.baseExceptionDM = baseExceptionDM;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
