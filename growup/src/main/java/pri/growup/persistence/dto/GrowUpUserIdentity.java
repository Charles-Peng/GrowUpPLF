package pri.growup.persistence.dto;

import java.util.Date;
import pri.growup.persistence.BaseDto;

public class GrowUpUserIdentity extends BaseDto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_user_identity.IDENTITY_ID
     *
     * @mbggenerated
     */
    private Byte identityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_user_identity.IDENTITY_NAME
     *
     * @mbggenerated
     */
    private String identityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_user_identity.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_user_identity.DELETE_TIME
     *
     * @mbggenerated
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grow_up_user_identity.DELETE_FLG
     *
     * @mbggenerated
     */
    private Byte deleteFlg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_user_identity.IDENTITY_ID
     *
     * @return the value of grow_up_user_identity.IDENTITY_ID
     *
     * @mbggenerated
     */
    public Byte getIdentityId() {
        return identityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_user_identity.IDENTITY_ID
     *
     * @param identityId the value for grow_up_user_identity.IDENTITY_ID
     *
     * @mbggenerated
     */
    public void setIdentityId(Byte identityId) {
        this.identityId = identityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_user_identity.IDENTITY_NAME
     *
     * @return the value of grow_up_user_identity.IDENTITY_NAME
     *
     * @mbggenerated
     */
    public String getIdentityName() {
        return identityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_user_identity.IDENTITY_NAME
     *
     * @param identityName the value for grow_up_user_identity.IDENTITY_NAME
     *
     * @mbggenerated
     */
    public void setIdentityName(String identityName) {
        this.identityName = identityName == null ? null : identityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_user_identity.CREATE_TIME
     *
     * @return the value of grow_up_user_identity.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_user_identity.CREATE_TIME
     *
     * @param createTime the value for grow_up_user_identity.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_user_identity.DELETE_TIME
     *
     * @return the value of grow_up_user_identity.DELETE_TIME
     *
     * @mbggenerated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_user_identity.DELETE_TIME
     *
     * @param deleteTime the value for grow_up_user_identity.DELETE_TIME
     *
     * @mbggenerated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grow_up_user_identity.DELETE_FLG
     *
     * @return the value of grow_up_user_identity.DELETE_FLG
     *
     * @mbggenerated
     */
    public Byte getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grow_up_user_identity.DELETE_FLG
     *
     * @param deleteFlg the value for grow_up_user_identity.DELETE_FLG
     *
     * @mbggenerated
     */
    public void setDeleteFlg(Byte deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}