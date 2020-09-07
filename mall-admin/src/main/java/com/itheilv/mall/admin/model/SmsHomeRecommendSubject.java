package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 首页推荐专题表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("sms_home_recommend_subject")
@ApiModel(value="SmsHomeRecommendSubject对象", description="首页推荐专题表")
public class SmsHomeRecommendSubject implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("subject_id")
    private Long subjectId;

    @TableField("subject_name")
    private String subjectName;

    @TableField("recommend_status")
    private Integer recommendStatus;

    @TableField("sort")
    private Integer sort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SmsHomeRecommendSubject{" +
        "id=" + id +
        ", subjectId=" + subjectId +
        ", subjectName=" + subjectName +
        ", recommendStatus=" + recommendStatus +
        ", sort=" + sort +
        "}";
    }
}
