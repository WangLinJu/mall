package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("ums_member")
@ApiModel(value="UmsMember对象", description="会员表")
public class UmsMember implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_level_id")
    private Long memberLevelId;

    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty(value = "手机号码")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "注册时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "头像")
    @TableField("icon")
    private String icon;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    @TableField("gender")
    private Integer gender;

    @ApiModelProperty(value = "生日")
    @TableField("birthday")
    private LocalDate birthday;

    @ApiModelProperty(value = "所做城市")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "职业")
    @TableField("job")
    private String job;

    @ApiModelProperty(value = "个性签名")
    @TableField("personalized_signature")
    private String personalizedSignature;

    @ApiModelProperty(value = "用户来源")
    @TableField("source_type")
    private Integer sourceType;

    @ApiModelProperty(value = "积分")
    @TableField("integration")
    private Integer integration;

    @ApiModelProperty(value = "成长值")
    @TableField("growth")
    private Integer growth;

    @ApiModelProperty(value = "剩余抽奖次数")
    @TableField("luckey_count")
    private Integer luckeyCount;

    @ApiModelProperty(value = "历史积分数量")
    @TableField("history_integration")
    private Integer historyIntegration;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    @Override
    public String toString() {
        return "UmsMember{" +
        "id=" + id +
        ", memberLevelId=" + memberLevelId +
        ", username=" + username +
        ", password=" + password +
        ", nickname=" + nickname +
        ", phone=" + phone +
        ", status=" + status +
        ", createTime=" + createTime +
        ", icon=" + icon +
        ", gender=" + gender +
        ", birthday=" + birthday +
        ", city=" + city +
        ", job=" + job +
        ", personalizedSignature=" + personalizedSignature +
        ", sourceType=" + sourceType +
        ", integration=" + integration +
        ", growth=" + growth +
        ", luckeyCount=" + luckeyCount +
        ", historyIntegration=" + historyIntegration +
        "}";
    }
}
