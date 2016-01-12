package com.xl.pfm.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * 项目的基本对象
 * 需要记录id和创建更新时间
 */
@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue
    protected Long id;

    @Column(nullable = false)
    protected Date created;

    @Column(nullable = false)
    protected Date updated;

    protected BaseItem() {
        created = new Date();
        updated = new Date();
    }

    public Long getId() {
        return id;
    }

    public Date getCreated() {
        return created;
    }

    public Date getUpdated() {
        return updated;
    }

    /**
     * 更新update字段
     */
    public void update() {
        updated = new Date();
    }


}
