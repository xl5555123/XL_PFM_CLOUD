package com.xl.pfm.model.assets.investment.cashequivalents;

import com.xl.pfm.model.Money;

import javax.persistence.Entity;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Cash extends CashAndCashEquivalents {

    public Cash() {

    }

    public Cash(Money money, Double howMuch) {
        setCost(howMuch);
        setMarketValue(howMuch);
        setBasedMoney(money);
    }

    @Override
    public String type() {
        return "cash";
    }

}
