package com.taotao.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 商品描述表
 * </p>
 *
 * @author rms
 * @since 2021-06-15
 */
public class TbItemDesc extends Model<TbItemDesc> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 商品描述
     */
    private String itemDesc;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 更新时间
     */
    private LocalDateTime updated;


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
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
        return this.itemId;
    }

    @Override
    public String toString() {
        return "TbItemDesc{" +
        "itemId=" + itemId +
        ", itemDesc=" + itemDesc +
        ", created=" + created +
        ", updated=" + updated +
        "}";
    }
}
