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
 * 积分消费设置
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("ums_integration_consume_setting")
@ApiModel(value="UmsIntegrationConsumeSetting对象", description="积分消费设置")
public class UmsIntegrationConsumeSetting implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "每一元需要抵扣的积分数量")
    @TableField("deduction_per_amount")
    private Integer deductionPerAmount;

    @ApiModelProperty(value = "每笔订单最高抵用百分比")
    @TableField("max_percent_per_order")
    private Integer maxPercentPerOrder;

    @ApiModelProperty(value = "每次使用积分最小单位100")
    @TableField("use_unit")
    private Integer useUnit;

    @ApiModelProperty(value = "是否可以和优惠券同用；0->不可以；1->可以")
    @TableField("coupon_status")
    private Integer couponStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDeductionPerAmount() {
        return deductionPerAmount;
    }

    public void setDeductionPerAmount(Integer deductionPerAmount) {
        this.deductionPerAmount = deductionPerAmount;
    }

    public Integer getMaxPercentPerOrder() {
        return maxPercentPerOrder;
    }

    public void setMaxPercentPerOrder(Integer maxPercentPerOrder) {
        this.maxPercentPerOrder = maxPercentPerOrder;
    }

    public Integer getUseUnit() {
        return useUnit;
    }

    public void setUseUnit(Integer useUnit) {
        this.useUnit = useUnit;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    @Override
    public String toString() {
        return "UmsIntegrationConsumeSetting{" +
        "id=" + id +
        ", deductionPerAmount=" + deductionPerAmount +
        ", maxPercentPerOrder=" + maxPercentPerOrder +
        ", useUnit=" + useUnit +
        ", couponStatus=" + couponStatus +
        "}";
    }
}
