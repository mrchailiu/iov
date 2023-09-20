package com.softeem.iov.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 手机号
     */
    private String telphone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 头像地址
     */
    private String img;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 注册时间
     */
    private LocalDateTime regtime;

    /**
     * 最后一次修改时间
     */
    private LocalDateTime lastmodify;

    /**
     * 身份证号
     */
    private String cardnum;

    /**
     * 用户状态0-正常  1-禁用
     */
    private Boolean status;

    /**
     * 随机盐
     */
    private String salt;

    /**
     * 是否删除0-否  1-是，做逻辑删除用
     */
    private Boolean del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public LocalDateTime getRegtime() {
        return regtime;
    }

    public void setRegtime(LocalDateTime regtime) {
        this.regtime = regtime;
    }
    public LocalDateTime getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(LocalDateTime lastmodify) {
        this.lastmodify = lastmodify;
    }
    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", realname=" + realname +
            ", telphone=" + telphone +
            ", email=" + email +
            ", img=" + img +
            ", birthday=" + birthday +
            ", regtime=" + regtime +
            ", lastmodify=" + lastmodify +
            ", cardnum=" + cardnum +
            ", status=" + status +
            ", salt=" + salt +
            ", del=" + del +
        "}";
    }
}
