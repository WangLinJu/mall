package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 限时购表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_flash_promotion")
@ApiModel(value="SmsFlashPromotion对象", description="限时购表")
public class SmsFlashPromotion implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("title")
    private String title;

    @ApiModelProperty(value = "开始日期")
    @TableField("start_date")
    private LocalDate startDate;

    @ApiModelProperty(value = "结束日期")
    @TableField("end_date")
    private LocalDate endDate;

    @ApiModelProperty(value = "上下线状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "秒杀时间段名称")
    @TableField("create_time")
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
        return "SmsFlashPromotion{" +
        "id=" + id +
        ", title=" + title +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", status=" + status +
        ", createTime=" + createTime +
        "}";
    }
}
