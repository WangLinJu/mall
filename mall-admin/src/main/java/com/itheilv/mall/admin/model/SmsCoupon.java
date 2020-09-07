package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 优惠卷表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_coupon")
@ApiModel(value="SmsCoupon对象", description="优惠卷表")
public class SmsCoupon implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    @TableField("type")
    private Integer type;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "使用平台：0->全部；1->移动；2->PC")
    @TableField("platform")
    private Integer platform;

    @ApiModelProperty(value = "数量")
    @TableField("count")
    private Integer count;

    @ApiModelProperty(value = "金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty(value = "每人限领张数")
    @TableField("per_limit")
    private Integer perLimit;

    @ApiModelProperty(value = "使用门槛；0表示无门槛")
    @TableField("min_point")
    private BigDecimal minPoint;

    @TableField("start_time")
    private LocalDateTime startTime;

    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "使用类型：0->全场通用；1->指定分类；2->指定商品")
    @TableField("use_type")
    private Integer useType;

    @ApiModelProperty(value = "备注")
    @TableField("note")
    private String note;

    @ApiModelProperty(value = "发行数量")
    @TableField("publish_count")
    private Integer publishCount;

    @ApiModelProperty(value = "已使用数量")
    @TableField("use_count")
    private Integer useCount;

    @ApiModelProperty(value = "领取数量")
    @TableField("receive_count")
    private Integer receiveCount;

    @ApiModelProperty(value = "可以领取的日期")
    @TableField("enable_time")
    private LocalDateTime enableTime;

    @ApiModelProperty(value = "优惠码")
    @TableField("code")
    private String code;

    @ApiModelProperty(value = "可领取的会员类型：0->无限时")
    @TableField("member_level")
    private Integer memberLevel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public LocalDateTime getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(LocalDateTime enableTime) {
        this.enableTime = enableTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    @Override
    public String toString() {
        return "SmsCoupon{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", platform=" + platform +
        ", count=" + count +
        ", amount=" + amount +
        ", perLimit=" + perLimit +
        ", minPoint=" + minPoint +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", useType=" + useType +
        ", note=" + note +
        ", publishCount=" + publishCount +
        ", useCount=" + useCount +
        ", receiveCount=" + receiveCount +
        ", enableTime=" + enableTime +
        ", code=" + code +
        ", memberLevel=" + memberLevel +
        "}";
    }
}
