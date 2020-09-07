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
 * 专题评论表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("cms_topic_comment")
@ApiModel(value="CmsTopicComment对象", description="专题评论表")
public class CmsTopicComment implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("member_nick_name")
    private String memberNickName;

    @TableField("topic_id")
    private Long topicId;

    @TableField("member_icon")
    private String memberIcon;

    @TableField("content")
    private String content;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("show_status")
    private Integer showStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    @Override
    public String toString() {
        return "CmsTopicComment{" +
        "id=" + id +
        ", memberNickName=" + memberNickName +
        ", topicId=" + topicId +
        ", memberIcon=" + memberIcon +
        ", content=" + content +
        ", createTime=" + createTime +
        ", showStatus=" + showStatus +
        "}";
    }
}
