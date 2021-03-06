package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 * 限时购场次表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_flash_promotion_session")
@ApiModel(value="SmsFlashPromotionSession对象", description="限时购场次表")
public class SmsFlashPromotionSession implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "场次名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "每日开始时间")
    @TableField("start_time")
    private LocalTime startTime;

    @ApiModelProperty(value = "每日结束时间")
    @TableField("end_time")
    private LocalTime endTime;

    @ApiModelProperty(value = "启用状态：0->不启用；1->启用")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;


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

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SmsFlashPromotionSession{" +
        "id=" + id +
        ", name=" + name +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
