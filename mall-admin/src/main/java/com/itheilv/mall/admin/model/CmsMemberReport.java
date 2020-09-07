package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户举报表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("cms_member_report")
@ApiModel(value="CmsMemberReport对象", description="用户举报表")
public class CmsMemberReport implements Serializable {

    private static final long serialVersionUID=1L;

    @TableField("id")
    private Long id;

    @ApiModelProperty(value = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    @TableField("report_type")
    private Integer reportType;

    @ApiModelProperty(value = "举报人")
    @TableField("report_member_name")
    private String reportMemberName;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("report_object")
    private String reportObject;

    @ApiModelProperty(value = "举报状态：0->未处理；1->已处理")
    @TableField("report_status")
    private Integer reportStatus;

    @ApiModelProperty(value = "处理结果：0->无效；1->有效；2->恶意")
    @TableField("handle_status")
    private Integer handleStatus;

    @TableField("note")
    private String note;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getReportMemberName() {
        return reportMemberName;
    }

    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getReportObject() {
        return reportObject;
    }

    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "CmsMemberReport{" +
        "id=" + id +
        ", reportType=" + reportType +
        ", reportMemberName=" + reportMemberName +
        ", createTime=" + createTime +
        ", reportObject=" + reportObject +
        ", reportStatus=" + reportStatus +
        ", handleStatus=" + handleStatus +
        ", note=" + note +
        "}";
    }
}
