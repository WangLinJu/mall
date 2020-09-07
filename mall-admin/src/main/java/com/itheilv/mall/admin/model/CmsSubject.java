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
 * 专题表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("cms_subject")
@ApiModel(value="CmsSubject对象", description="专题表")
public class CmsSubject implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("category_id")
    private Long categoryId;

    @TableField("title")
    private String title;

    @ApiModelProperty(value = "专题主图")
    @TableField("pic")
    private String pic;

    @ApiModelProperty(value = "关联产品数量")
    @TableField("product_count")
    private Integer productCount;

    @TableField("recommend_status")
    private Integer recommendStatus;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("collect_count")
    private Integer collectCount;

    @TableField("read_count")
    private Integer readCount;

    @TableField("comment_count")
    private Integer commentCount;

    @ApiModelProperty(value = "画册图片用逗号分割")
    @TableField("album_pics")
    private String albumPics;

    @TableField("description")
    private String description;

    @ApiModelProperty(value = "显示状态：0->不显示；1->显示")
    @TableField("show_status")
    private Integer showStatus;

    @TableField("content")
    private String content;

    @ApiModelProperty(value = "转发数")
    @TableField("forward_count")
    private Integer forwardCount;

    @ApiModelProperty(value = "专题分类名称")
    @TableField("category_name")
    private String categoryName;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CmsSubject{" +
        "id=" + id +
        ", categoryId=" + categoryId +
        ", title=" + title +
        ", pic=" + pic +
        ", productCount=" + productCount +
        ", recommendStatus=" + recommendStatus +
        ", createTime=" + createTime +
        ", collectCount=" + collectCount +
        ", readCount=" + readCount +
        ", commentCount=" + commentCount +
        ", albumPics=" + albumPics +
        ", description=" + description +
        ", showStatus=" + showStatus +
        ", content=" + content +
        ", forwardCount=" + forwardCount +
        ", categoryName=" + categoryName +
        "}";
    }
}
