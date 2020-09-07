package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 公司收发货地址表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("oms_company_address")
@ApiModel(value="OmsCompanyAddress对象", description="公司收发货地址表")
public class OmsCompanyAddress implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "地址名称")
    @TableField("address_name")
    private String addressName;

    @ApiModelProperty(value = "默认发货地址：0->否；1->是")
    @TableField("send_status")
    private Integer sendStatus;

    @ApiModelProperty(value = "是否默认收货地址：0->否；1->是")
    @TableField("receive_status")
    private Integer receiveStatus;

    @ApiModelProperty(value = "收发货人姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "收货人电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "省/直辖市")
    @TableField("province")
    private String province;

    @ApiModelProperty(value = "市")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "区")
    @TableField("region")
    private String region;

    @ApiModelProperty(value = "详细地址")
    @TableField("detail_address")
    private String detailAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        return "OmsCompanyAddress{" +
        "id=" + id +
        ", addressName=" + addressName +
        ", sendStatus=" + sendStatus +
        ", receiveStatus=" + receiveStatus +
        ", name=" + name +
        ", phone=" + phone +
        ", province=" + province +
        ", city=" + city +
        ", region=" + region +
        ", detailAddress=" + detailAddress +
        "}";
    }
}
