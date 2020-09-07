package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 会员等级表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("ums_member_level")
@ApiModel(value="UmsMemberLevel对象", description="会员等级表")
public class UmsMemberLevel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("growth_point")
    private Integer growthPoint;

    @ApiModelProperty(value = "是否为默认等级：0->不是；1->是")
    @TableField("default_status")
    private Integer defaultStatus;

    @ApiModelProperty(value = "免运费标准")
    @TableField("free_freight_point")
    private BigDecimal freeFreightPoint;

    @ApiModelProperty(value = "每次评价获取的成长值")
    @TableField("comment_growth_point")
    private Integer commentGrowthPoint;

    @ApiModelProperty(value = "是否有免邮特权")
    @TableField("priviledge_free_freight")
    private Integer priviledgeFreeFreight;

    @ApiModelProperty(value = "是否有签到特权")
    @TableField("priviledge_sign_in")
    private Integer priviledgeSignIn;

    @ApiModelProperty(value = "是否有评论获奖励特权")
    @TableField("priviledge_comment")
    private Integer priviledgeComment;

    @ApiModelProperty(value = "是否有专享活动特权")
    @TableField("priviledge_promotion")
    private Integer priviledgePromotion;

    @ApiModelProperty(value = "是否有会员价格特权")
    @TableField("priviledge_member_price")
    private Integer priviledgeMemberPrice;

    @ApiModelProperty(value = "是否有生日特权")
    @TableField("priviledge_birthday")
    private Integer priviledgeBirthday;

    @TableField("note")
    private String note;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Integer getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Integer defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Integer getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Integer priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public Integer getPriviledgeSignIn() {
        return priviledgeSignIn;
    }

    public void setPriviledgeSignIn(Integer priviledgeSignIn) {
        this.priviledgeSignIn = priviledgeSignIn;
    }

    public Integer getPriviledgeComment() {
        return priviledgeComment;
    }

    public void setPriviledgeComment(Integer priviledgeComment) {
        this.priviledgeComment = priviledgeComment;
    }

    public Integer getPriviledgePromotion() {
        return priviledgePromotion;
    }

    public void setPriviledgePromotion(Integer priviledgePromotion) {
        this.priviledgePromotion = priviledgePromotion;
    }

    public Integer getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Integer priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Integer getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Integer priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "UmsMemberLevel{" +
        "id=" + id +
        ", name=" + name +
        ", growthPoint=" + growthPoint +
        ", defaultStatus=" + defaultStatus +
        ", freeFreightPoint=" + freeFreightPoint +
        ", commentGrowthPoint=" + commentGrowthPoint +
        ", priviledgeFreeFreight=" + priviledgeFreeFreight +
        ", priviledgeSignIn=" + priviledgeSignIn +
        ", priviledgeComment=" + priviledgeComment +
        ", priviledgePromotion=" + priviledgePromotion +
        ", priviledgeMemberPrice=" + priviledgeMemberPrice +
        ", priviledgeBirthday=" + priviledgeBirthday +
        ", note=" + note +
        "}";
    }
}
