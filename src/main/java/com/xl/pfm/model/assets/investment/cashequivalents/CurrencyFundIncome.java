package com.xl.pfm.model.assets.investment.cashequivalents;

import com.xl.pfm.model.BaseItem;

import javax.persistence.*;

/**
 * Created by XingLiang on 2016/1/19.
 */
@Entity
public class CurrencyFundIncome extends BaseItem {

    @Column(nullable = false)
    private Double incomePerWan;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "currencyFundId")
    private CurrencyFund currencyFund;

    @Column(nullable = false)
    private Double rate;

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getIncomePerWan() {
        return incomePerWan;
    }

    public void setIncomePerWan(Double incomePerWan) {
        this.incomePerWan = incomePerWan;
    }

    public CurrencyFund getCurrencyFund() {
        return currencyFund;
    }

    public void setCurrencyFund(CurrencyFund currencyFund) {
        this.currencyFund = currencyFund;
    }

    @Override
    public String type() {
        return "currency-fund-income";
    }
}
