package com.mybatis.pojo;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private int id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mobile
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private String password;

    private String salt;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.insert_uid
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Integer insertUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.insert_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_del
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Boolean isDel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.is_job
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Boolean isJob;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mcode
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private String mcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.send_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.version
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public int getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mobile
     *
     * @return the value of user.mobile
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mobile
     *
     * @param mobile the value for user.mobile
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.insert_uid
     *
     * @return the value of user.insert_uid
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Integer getInsertUid() {
        return insertUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.insert_uid
     *
     * @param insertUid the value for user.insert_uid
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setInsertUid(Integer insertUid) {
        this.insertUid = insertUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.insert_time
     *
     * @return the value of user.insert_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.insert_time
     *
     * @param createTime the value for user.insert_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_del
     *
     * @return the value of user.is_del
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_del
     *
     * @param isDel the value for user.is_del
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.is_job
     *
     * @return the value of user.is_job
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Boolean getIsJob() {
        return isJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.is_job
     *
     * @param isJob the value for user.is_job
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setIsJob(Boolean isJob) {
        this.isJob = isJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mcode
     *
     * @return the value of user.mcode
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public String getMcode() {
        return mcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mcode
     *
     * @param mcode the value for user.mcode
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setMcode(String mcode) {
        this.mcode = mcode == null ? null : mcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.send_time
     *
     * @return the value of user.send_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.send_time
     *
     * @param sendTime the value for user.send_time
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.version
     *
     * @return the value of user.version
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public Integer getVersion() {
        return version;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getDel() {
        return isDel;
    }

    public void setDel(Boolean del) {
        isDel = del;
    }

    public Boolean getJob() {
        return isJob;
    }

    public void setJob(Boolean job) {
        isJob = job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.version
     *
     * @param version the value for user.version
     *
     * @mbg.generated Sun May 31 17:50:59 CST 2020
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", insertUid=" + insertUid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDel=" + isDel +
                ", isJob=" + isJob +
                ", mcode='" + mcode + '\'' +
                ", sendTime=" + sendTime +
                ", version=" + version +
                '}';
    }
}