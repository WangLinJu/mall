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
 * 商品审核记录
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("pms_product_vertify_record")
@ApiModel(value="PmsProductVertifyRecord对象", description="商品审核记录")
public class PmsProductVertifyRecord implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("product_id")
    private Long productId;

    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "审核人")
    @TableField("vertify_man")
    private String vertifyMan;

    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "反馈详情")
    @TableField("detail")
    private String detail;


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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getVertifyMan() {
        return vertifyMan;
    }

    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "PmsProductVertifyRecord{" +
        "id=" + id +
        ", productId=" + productId +
        ", createTime=" + createTime +
        ", vertifyMan=" + vertifyMan +
        ", status=" + status +
        ", detail=" + detail +
        "}";
    }
}
