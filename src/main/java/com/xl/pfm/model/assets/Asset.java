package com.xl.pfm.model.assets;

import com.xl.pfm.model.BaseMoneyItem;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by XingLiang on 2016/1/19.
 */
@MappedSuperclass
public abstract class Asset extends BaseMoneyItem {

    @Column(nullable = false)
    protected String displayName;

    @Override
    public String displayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
