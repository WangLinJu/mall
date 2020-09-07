package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 会员登录记录
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("ums_member_login_log")
@ApiModel(value="UmsMemberLoginLog对象", description="会员登录记录")
public class UmsMemberLoginLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_id")
    private Long memberId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("ip")
    private String ip;

    @TableField("city")
    private String city;

    @ApiModelProperty(value = "登录类型：0->PC；1->android;2->ios;3->小程序")
    @TableField("login_type")
    private Integer loginType;

    @TableField("province")
    private String province;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "UmsMemberLoginLog{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", createTime=" + createTime +
        ", ip=" + ip +
        ", city=" + city +
        ", loginType=" + loginType +
        ", province=" + province +
        "}";
    }
}
