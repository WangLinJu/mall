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
 * 商品限时购与商品关系表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_flash_promotion_product_relation")
@ApiModel(value="SmsFlashPromotionProductRelation对象", description="商品限时购与商品关系表")
public class SmsFlashPromotionProductRelation implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("flash_promotion_id")
    private Long flashPromotionId;

    @ApiModelProperty(value = "编号")
    @TableField("flash_promotion_session_id")
    private Long flashPromotionSessionId;

    @TableField("product_id")
    private Long productId;

    @ApiModelProperty(value = "限时购价格")
    @TableField("flash_promotion_price")
    private BigDecimal flashPromotionPrice;

    @ApiModelProperty(value = "限时购数量")
    @TableField("flash_promotion_count")
    private Integer flashPromotionCount;

    @ApiModelProperty(value = "每人限购数量")
    @TableField("flash_promotion_limit")
    private Integer flashPromotionLimit;

    @ApiModelProperty(value = "排序")
    @TableField("sort")
    private Integer sort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlashPromotionId() {
        return flashPromotionId;
    }

    public void setFlashPromotionId(Long flashPromotionId) {
        this.flashPromotionId = flashPromotionId;
    }

    public Long getFlashPromotionSessionId() {
        return flashPromotionSessionId;
    }

    public void setFlashPromotionSessionId(Long flashPromotionSessionId) {
        this.flashPromotionSessionId = flashPromotionSessionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SmsFlashPromotionProductRelation{" +
        "id=" + id +
        ", flashPromotionId=" + flashPromotionId +
        ", flashPromotionSessionId=" + flashPromotionSessionId +
        ", productId=" + productId +
        ", flashPromotionPrice=" + flashPromotionPrice +
        ", flashPromotionCount=" + flashPromotionCount +
        ", flashPromotionLimit=" + flashPromotionLimit +
        ", sort=" + sort +
        "}";
    }
}
