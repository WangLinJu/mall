package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 帮助表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("cms_help")
@ApiModel(value="CmsHelp对象", description="帮助表")
public class CmsHelp implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("category_id")
    private Long categoryId;

    @TableField("icon")
    private String icon;

    @TableField("title")
    private String title;

    @TableField("show_status")
    private Integer showStatus;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("read_count")
    private Integer readCount;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CmsHelp{" +
        "id=" + id +
        ", categoryId=" + categoryId +
        ", icon=" + icon +
        ", title=" + title +
        ", showStatus=" + showStatus +
        ", createTime=" + createTime +
        ", readCount=" + readCount +
        ", content=" + content +
        "}";
    }
}
