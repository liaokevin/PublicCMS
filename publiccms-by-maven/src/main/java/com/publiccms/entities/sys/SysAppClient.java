package com.publiccms.entities.sys;

// Generated 2016-3-1 16:21:35 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.sanluan.common.source.entity.MyColumn;

/**
 * AppClient generated by hbm2java
 */
@Entity
@Table(name = "sys_app_client", uniqueConstraints = @UniqueConstraint(columnNames = { "site_id", "uuid", "channel" }))
public class SysAppClient implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "站点", condition = true)
    private int siteId;
    @MyColumn(title = "渠道", condition = true)
    private String channel;
    @MyColumn(title = "唯一标识符")
    private String uuid;
    @MyColumn(title = "用户ID", condition = true)
    private Integer userId;
    @MyColumn(title = "版本")
    private String clientVersion;
    @MyColumn(title = "允许推送", condition = true)
    private boolean allowPush;
    @MyColumn(title = "推送授权码")
    private String pushToken;
    @MyColumn(title = "上次登录日期", condition = true, order = true)
    private Date lastLoginDate;
    @MyColumn(title = "上次登陆IP")
    private String lastLoginIp;
    @MyColumn(title = "创建日期", condition = true, order = true)
    private Date createDate;
    @MyColumn(title = "已禁用", condition = true)
    private boolean disabled;

    public SysAppClient() {
    }

    public SysAppClient(int siteId, String channel, String uuid, String clientVersion, boolean allowPush, Date createDate,
            boolean disabled) {
        this.siteId = siteId;
        this.channel = channel;
        this.uuid = uuid;
        this.clientVersion = clientVersion;
        this.allowPush = allowPush;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    public SysAppClient(int siteId, String channel, String uuid, Integer userId, String clientVersion, boolean allowPush,
            String pushToken, Date lastLoginDate, String lastLoginIp, Date createDate, boolean disabled) {
        this.siteId = siteId;
        this.channel = channel;
        this.uuid = uuid;
        this.userId = userId;
        this.clientVersion = clientVersion;
        this.allowPush = allowPush;
        this.pushToken = pushToken;
        this.lastLoginDate = lastLoginDate;
        this.lastLoginIp = lastLoginIp;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "channel", nullable = false, length = 20)
    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Column(name = "uuid", nullable = false, length = 50)
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Column(name = "user_id")
    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Column(name = "client_version", nullable = false, length = 50)
    public String getClientVersion() {
        return this.clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    @Column(name = "allow_push", nullable = false)
    public boolean isAllowPush() {
        return this.allowPush;
    }

    public void setAllowPush(boolean allowPush) {
        this.allowPush = allowPush;
    }

    @Column(name = "push_token", length = 50)
    public String getPushToken() {
        return this.pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_login_date", length = 19)
    public Date getLastLoginDate() {
        return this.lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Column(name = "last_login_ip", length = 20)
    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}