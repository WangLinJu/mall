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
 * 话题表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("cms_topic")
@ApiModel(value="CmsTopic对象", description="话题表")
public class CmsTopic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("category_id")
    private Long categoryId;

    @TableField("name")
    private String name;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("start_time")
    private LocalDateTime startTime;

    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "参与人数")
    @TableField("attend_count")
    private Integer attendCount;

    @ApiModelProperty(value = "关注人数")
    @TableField("attention_count")
    private Integer attentionCount;

    @TableField("read_count")
    private Integer readCount;

    @ApiModelProperty(value = "奖品名称")
    @TableField("award_name")
    private String awardName;

    @ApiModelProperty(value = "参与方式")
    @TableField("attend_type")
    private String attendType;

    @ApiModelProperty(value = "话题内容")
    @TableField("content")
    private String content;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getAttendCount() {
        return attendCount;
    }

    public void setAttendCount(Integer attendCount) {
        this.attendCount = attendCount;
    }

    public Integer getAttentionCount() {
        return attentionCount;
    }

    public void setAttentionCount(Integer attentionCount) {
        this.attentionCount = attentionCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public String getAttendType() {
        return attendType;
    }

    public void setAttendType(String attendType) {
        this.attendType = attendType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CmsTopic{" +
        "id=" + id +
        ", categoryId=" + categoryId +
        ", name=" + name +
        ", createTime=" + createTime +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", attendCount=" + attendCount +
        ", attentionCount=" + attentionCount +
        ", readCount=" + readCount +
        ", awardName=" + awardName +
        ", attendType=" + attendType +
        ", content=" + content +
        "}";
    }
}
