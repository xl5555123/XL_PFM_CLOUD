package com.xl.pfm.model.assets.fixedasset;

import com.xl.pfm.model.BaseMoneyItem;

import javax.persistence.Entity;

/**
 * Created by XingLiang on 2016/1/20.
 */
@Entity
public class Rent extends BaseMoneyItem {
    @Override
    public String type() {
        return null;
    }

    @Override
    public String displayName() {
        return null;
    }
}
