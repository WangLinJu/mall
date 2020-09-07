package com.itheilv.mall.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 画册图片表
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@TableName("pms_album_pic")
@ApiModel(value="PmsAlbumPic对象", description="画册图片表")
public class PmsAlbumPic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("album_id")
    private Long albumId;

    @TableField("pic")
    private String pic;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "PmsAlbumPic{" +
        "id=" + id +
        ", albumId=" + albumId +
        ", pic=" + pic +
        "}";
    }
}
