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
 * 
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("pms_product_operate_log")
@ApiModel(value="PmsProductOperateLog对象", description="")
public class PmsProductOperateLog implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("price_old")
    private BigDecimal priceOld;

    @TableField("price_new")
    private BigDecimal priceNew;

    @TableField("sale_price_old")
    private BigDecimal salePriceOld;

    @TableField("sale_price_new")
    private BigDecimal salePriceNew;

    @ApiModelProperty(value = "赠送的积分")
    @TableField("gift_point_old")
    private Integer giftPointOld;

    @TableField("gift_point_new")
    private Integer giftPointNew;

    @TableField("use_point_limit_old")
    private Integer usePointLimitOld;

    @TableField("use_point_limit_new")
    private Integer usePointLimitNew;

    @ApiModelProperty(value = "操作人")
    @TableField("operate_man")
    private String operateMan;

    @TableField("create_time")
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(BigDecimal priceOld) {
        this.priceOld = priceOld;
    }

    public BigDecimal getPriceNew() {
        return priceNew;
    }

    public void setPriceNew(BigDecimal priceNew) {
        this.priceNew = priceNew;
    }

    public BigDecimal getSalePriceOld() {
        return salePriceOld;
    }

    public void setSalePriceOld(BigDecimal salePriceOld) {
        this.salePriceOld = salePriceOld;
    }

    public BigDecimal getSalePriceNew() {
        return salePriceNew;
    }

    public void setSalePriceNew(BigDecimal salePriceNew) {
        this.salePriceNew = salePriceNew;
    }

    public Integer getGiftPointOld() {
        return giftPointOld;
    }

    public void setGiftPointOld(Integer giftPointOld) {
        this.giftPointOld = giftPointOld;
    }

    public Integer getGiftPointNew() {
        return giftPointNew;
    }

    public void setGiftPointNew(Integer giftPointNew) {
        this.giftPointNew = giftPointNew;
    }

    public Integer getUsePointLimitOld() {
        return usePointLimitOld;
    }

    public void setUsePointLimitOld(Integer usePointLimitOld) {
        this.usePointLimitOld = usePointLimitOld;
    }

    public Integer getUsePointLimitNew() {
        return usePointLimitNew;
    }

    public void setUsePointLimitNew(Integer usePointLimitNew) {
        this.usePointLimitNew = usePointLimitNew;
    }

    public String getOperateMan() {
        return operateMan;
    }

    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "PmsProductOperateLog{" +
        "id=" + id +
        ", productId=" + productId +
        ", priceOld=" + priceOld +
        ", priceNew=" + priceNew +
        ", salePriceOld=" + salePriceOld +
        ", salePriceNew=" + salePriceNew +
        ", giftPointOld=" + giftPointOld +
        ", giftPointNew=" + giftPointNew +
        ", usePointLimitOld=" + usePointLimitOld +
        ", usePointLimitNew=" + usePointLimitNew +
        ", operateMan=" + operateMan +
        ", createTime=" + createTime +
        "}";
    }
}
