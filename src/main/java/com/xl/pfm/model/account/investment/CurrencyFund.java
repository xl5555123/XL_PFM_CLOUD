package com.xl.pfm.model.account.investment;

import com.xl.pfm.model.money.Money;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class CurrencyFund extends AbstractInvestment {

    @Column(nullable = false)
    private Double incomePerWan;

    @Column(nullable = false)
    private Double income;

    public CurrencyFund() {
        super();
    }

    public CurrencyFund(Money money, Double ammout) {
        this.tradeMoney = money;
        this.cost = ammout;
    }

    @Override
    protected void updateMarketValueAndCost() {
        marketValue = income + cost;
    }

    public void updateForNewDay(Double newDayIncomePerWan) {
        this.incomePerWan = newDayIncomePerWan;
        income += incomePerWan * cost / 10000;
        updateMarketValueAndCost();
    }


}
