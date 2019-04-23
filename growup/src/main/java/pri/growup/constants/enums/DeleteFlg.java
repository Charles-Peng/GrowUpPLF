package pri.growup.constants.enums;

/**
 * 删除标记枚举
 *
 * @author PLF
 */
public enum DeleteFlg {
    NOTDELETE((byte)0), ISDELETE((byte)1);

    /**
     * 代表的值
     */
    private Byte codeNum;

    DeleteFlg(Byte codeNum) {
        this.codeNum = codeNum;
    }

    public Byte getCodeNum() {
        return codeNum;
    }
}
