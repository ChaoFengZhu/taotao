package com.taotao.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 商品规则参数
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
public class TbItemParam extends Model<TbItemParam> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品类目ID
     */
    private Long itemCatId;

    /**
     * 参数数据，格式为json格式
     */
    private String paramData;

    private LocalDateTime created;

    private LocalDateTime updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TbItemParam{" +
        "id=" + id +
        ", itemCatId=" + itemCatId +
        ", paramData=" + paramData +
        ", created=" + created +
        ", updated=" + updated +
        "}";
    }
}
