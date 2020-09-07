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
 * 用户标签表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("ums_member_tag")
@ApiModel(value="UmsMemberTag对象", description="用户标签表")
public class UmsMemberTag implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "自动打标签完成订单数量")
    @TableField("finish_order_count")
    private Integer finishOrderCount;

    @ApiModelProperty(value = "自动打标签完成订单金额")
    @TableField("finish_order_amount")
    private BigDecimal finishOrderAmount;


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

    public Integer getFinishOrderCount() {
        return finishOrderCount;
    }

    public void setFinishOrderCount(Integer finishOrderCount) {
        this.finishOrderCount = finishOrderCount;
    }

    public BigDecimal getFinishOrderAmount() {
        return finishOrderAmount;
    }

    public void setFinishOrderAmount(BigDecimal finishOrderAmount) {
        this.finishOrderAmount = finishOrderAmount;
    }

    @Override
    public String toString() {
        return "UmsMemberTag{" +
        "id=" + id +
        ", name=" + name +
        ", finishOrderCount=" + finishOrderCount +
        ", finishOrderAmount=" + finishOrderAmount +
        "}";
    }
}
