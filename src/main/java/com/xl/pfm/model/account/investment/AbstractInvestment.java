package com.xl.pfm.model.account.investment;

import com.xl.pfm.model.BaseItem;
import com.xl.pfm.model.money.Money;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * 投资实体的抽象类
 */
@MappedSuperclass
public abstract class AbstractInvestment extends BaseItem {

    @OneToOne(cascade = CascadeType.REFRESH)
    protected Money tradeMoney;

    @Column(nullable = false)
    protected Double marketValue;

    @Column(nullable = false)
    protected Double cost;

    protected AbstractInvestment() {
        super();
    }

    public Money getTradeMoney() {
        return tradeMoney;
    }

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

    abstract protected void updateMarketValueAndCost();
}
