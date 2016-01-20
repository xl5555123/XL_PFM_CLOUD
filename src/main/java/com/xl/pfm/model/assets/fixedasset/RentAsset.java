package com.xl.pfm.model.assets.fixedasset;

import javax.persistence.Entity;

/**
 * 可租赁固定资产
 * Created by XingLiang on 2016/1/20.
 */
@Entity
public class RentAsset extends FixedAsset {



    @Override
    public String type() {
        return "rent-asset";
    }
}
