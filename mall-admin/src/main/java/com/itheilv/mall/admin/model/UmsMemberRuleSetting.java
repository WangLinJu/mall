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
 * 会员积分成长规则表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("ums_member_rule_setting")
@ApiModel(value="UmsMemberRuleSetting对象", description="会员积分成长规则表")
public class UmsMemberRuleSetting implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "连续签到天数")
    @TableField("continue_sign_day")
    private Integer continueSignDay;

    @ApiModelProperty(value = "连续签到赠送数量")
    @TableField("continue_sign_point")
    private Integer continueSignPoint;

    @ApiModelProperty(value = "每消费多少元获取1个点")
    @TableField("consume_per_point")
    private BigDecimal consumePerPoint;

    @ApiModelProperty(value = "最低获取点数的订单金额")
    @TableField("low_order_amount")
    private BigDecimal lowOrderAmount;

    @ApiModelProperty(value = "每笔订单最高获取点数")
    @TableField("max_point_per_order")
    private Integer maxPointPerOrder;

    @ApiModelProperty(value = "类型：0->积分规则；1->成长值规则")
    @TableField("type")
    private Integer type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContinueSignDay() {
        return continueSignDay;
    }

    public void setContinueSignDay(Integer continueSignDay) {
        this.continueSignDay = continueSignDay;
    }

    public Integer getContinueSignPoint() {
        return continueSignPoint;
    }

    public void setContinueSignPoint(Integer continueSignPoint) {
        this.continueSignPoint = continueSignPoint;
    }

    public BigDecimal getConsumePerPoint() {
        return consumePerPoint;
    }

    public void setConsumePerPoint(BigDecimal consumePerPoint) {
        this.consumePerPoint = consumePerPoint;
    }

    public BigDecimal getLowOrderAmount() {
        return lowOrderAmount;
    }

    public void setLowOrderAmount(BigDecimal lowOrderAmount) {
        this.lowOrderAmount = lowOrderAmount;
    }

    public Integer getMaxPointPerOrder() {
        return maxPointPerOrder;
    }

    public void setMaxPointPerOrder(Integer maxPointPerOrder) {
        this.maxPointPerOrder = maxPointPerOrder;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UmsMemberRuleSetting{" +
        "id=" + id +
        ", continueSignDay=" + continueSignDay +
        ", continueSignPoint=" + continueSignPoint +
        ", consumePerPoint=" + consumePerPoint +
        ", lowOrderAmount=" + lowOrderAmount +
        ", maxPointPerOrder=" + maxPointPerOrder +
        ", type=" + type +
        "}";
    }
}
