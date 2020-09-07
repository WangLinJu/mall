package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 优惠券和产品分类关系表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_coupon_product_category_relation")
@ApiModel(value="SmsCouponProductCategoryRelation对象", description="优惠券和产品分类关系表")
public class SmsCouponProductCategoryRelation implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("coupon_id")
    private Long couponId;

    @TableField("product_category_id")
    private Long productCategoryId;

    @ApiModelProperty(value = "产品分类名称")
    @TableField("product_category_name")
    private String productCategoryName;

    @ApiModelProperty(value = "父分类名称")
    @TableField("parent_category_name")
    private String parentCategoryName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    @Override
    public String toString() {
        return "SmsCouponProductCategoryRelation{" +
        "id=" + id +
        ", couponId=" + couponId +
        ", productCategoryId=" + productCategoryId +
        ", productCategoryName=" + productCategoryName +
        ", parentCategoryName=" + parentCategoryName +
        "}";
    }
}
