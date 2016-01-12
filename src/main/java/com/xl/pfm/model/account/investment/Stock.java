package com.xl.pfm.model.account.investment;

import com.xl.pfm.model.money.Money;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Stock extends AbstractInvestment {

    @Column(nullable = false)
    private Integer share;

    @Column(nullable = false)
    private Double prizePerShare;

    @Column(nullable = false)
    private Double costPerShare;

    public Stock() {
        super();
    }

    public Stock(Money money, Integer share, Double costPerShare) {
        super();
        this.tradeMoney = money;
        this.share = share;
        this.costPerShare = costPerShare;
        this.prizePerShare = costPerShare;
        updateMarketValueAndCost();
    }

    @Override
    protected void updateMarketValueAndCost() {
        setMarketValue(this.prizePerShare * this.share);
        setCost(this.costPerShare * this.share);
    }

    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
        updateMarketValueAndCost();
        update();
    }

    public Double getPrizePerShare() {
        return prizePerShare;
    }

    public void setPrizePerShare(Double prizePerShare) {
        this.prizePerShare = prizePerShare;
        updateMarketValueAndCost();
        update();
    }

    public Double getCostPerShare() {
        return costPerShare;
    }

    public void setCostPerShare(Double costPerShare) {
        this.costPerShare = costPerShare;
        updateMarketValueAndCost();
        update();
    }

}
