package com.xl.pfm.model.assets.investment;


import com.xl.pfm.model.assets.Asset;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by XingLiang on 2016/1/19.
 */
@MappedSuperclass
public abstract class Investment extends Asset {


    @Column(nullable = false)
    protected Double cost;

    @Column(nullable = false)
    protected Double marketValue;

    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
        update();
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
        update();
    }
}
