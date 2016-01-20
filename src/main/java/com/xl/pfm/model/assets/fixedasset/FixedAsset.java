package com.xl.pfm.model.assets.fixedasset;

import com.xl.pfm.model.assets.Asset;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by XingLiang on 2016/1/19.
 */
@MappedSuperclass
public abstract class FixedAsset extends Asset {

    @Column(nullable = false)
    protected Double purchasedMoney;

    public Double getPurchasedMoney() {
        return purchasedMoney;
    }

    public void setPurchasedMoney(Double purchasedMoney) {
        this.purchasedMoney = purchasedMoney;
    }
}
