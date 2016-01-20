package com.xl.pfm.model.assets.investment.cashequivalents;

import com.xl.pfm.model.Money;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class CurrencyFund extends CashAndCashEquivalents {

    @Column(nullable = false)
    private Double incomePerWan;

    @Column(nullable = false)
    private Double income;

    @OneToMany(mappedBy = "id")
    private List<CurrencyFundIncome> currencyFundIncomes;

    @Column(nullable = false)
    private Double sevenDayRate;

    public CurrencyFund() {
        super();
    }

    public CurrencyFund(Money money, Double howmuch) {
        setBasedMoney(money);
        setCost(howmuch);
        setMarketValue(howmuch);
    }

    @Override
    public String type() {
        return "currency-fund";
    }

}
