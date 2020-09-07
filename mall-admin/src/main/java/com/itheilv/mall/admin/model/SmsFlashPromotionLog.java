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
 * 限时购通知记录
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_flash_promotion_log")
@ApiModel(value="SmsFlashPromotionLog对象", description="限时购通知记录")
public class SmsFlashPromotionLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("member_id")
    private Integer memberId;

    @TableField("product_id")
    private Long productId;

    @TableField("member_phone")
    private String memberPhone;

    @TableField("product_name")
    private String productName;

    @ApiModelProperty(value = "会员订阅时间")
    @TableField("subscribe_time")
    private LocalDateTime subscribeTime;

    @TableField("send_time")
    private LocalDateTime sendTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDateTime getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(LocalDateTime subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "SmsFlashPromotionLog{" +
        "id=" + id +
        ", memberId=" + memberId +
        ", productId=" + productId +
        ", memberPhone=" + memberPhone +
        ", productName=" + productName +
        ", subscribeTime=" + subscribeTime +
        ", sendTime=" + sendTime +
        "}";
    }
}
