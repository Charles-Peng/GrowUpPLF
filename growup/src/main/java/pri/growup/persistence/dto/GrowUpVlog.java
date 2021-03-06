package pri.growup.persistence.dto;

import java.util.Date;
import pri.growup.persistence.BaseDto;

public class GrowUpVlog extends BaseDto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_vlog.VLOG_ID
     *
     * @mbggenerated
     */
    private String vlogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_vlog.VLOG_PATH
     *
     * @mbggenerated
     */
    private String vlogPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_vlog.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_vlog.DELETE_TIME
     *
     * @mbggenerated
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_vlog.DELETE_FLG
     *
     * @mbggenerated
     */
    private Byte deleteFlg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_vlog.VLOG_ID
     *
     * @return the value of grow_up_vlog.VLOG_ID
     *
     * @mbggenerated
     */
    public String getVlogId() {
        return vlogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_vlog.VLOG_ID
     *
     * @param vlogId the value for grow_up_vlog.VLOG_ID
     *
     * @mbggenerated
     */
    public void setVlogId(String vlogId) {
        this.vlogId = vlogId == null ? null : vlogId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_vlog.VLOG_PATH
     *
     * @return the value of grow_up_vlog.VLOG_PATH
     *
     * @mbggenerated
     */
    public String getVlogPath() {
        return vlogPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_vlog.VLOG_PATH
     *
     * @param vlogPath the value for grow_up_vlog.VLOG_PATH
     *
     * @mbggenerated
     */
    public void setVlogPath(String vlogPath) {
        this.vlogPath = vlogPath == null ? null : vlogPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_vlog.CREATE_TIME
     *
     * @return the value of grow_up_vlog.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_vlog.CREATE_TIME
     *
     * @param createTime the value for grow_up_vlog.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_vlog.DELETE_TIME
     *
     * @return the value of grow_up_vlog.DELETE_TIME
     *
     * @mbggenerated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_vlog.DELETE_TIME
     *
     * @param deleteTime the value for grow_up_vlog.DELETE_TIME
     *
     * @mbggenerated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_vlog.DELETE_FLG
     *
     * @return the value of grow_up_vlog.DELETE_FLG
     *
     * @mbggenerated
     */
    public Byte getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_vlog.DELETE_FLG
     *
     * @param deleteFlg the value for grow_up_vlog.DELETE_FLG
     *
     * @mbggenerated
     */
    public void setDeleteFlg(Byte deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}