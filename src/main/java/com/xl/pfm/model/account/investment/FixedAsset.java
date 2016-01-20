package com.xl.pfm.model.account.investment;

import javax.persistence.Entity;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class FixedAsset extends AbstractInvestment {
    @Override
    protected void updateMarketValueAndCost() {

    }

    @Override
    public String type() {
        return "fixed-asset";
    }

    @Override
    public String displayName() {
        return "fixed-asset";
    }
}
