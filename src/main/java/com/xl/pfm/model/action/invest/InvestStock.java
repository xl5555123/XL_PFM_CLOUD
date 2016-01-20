package com.xl.pfm.model.action.invest;

import com.xl.pfm.model.assets.investment.stock.Stock;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

/**
 * Created by XingLiang on 2016/1/13.
 */
public class InvestStock extends AbstractInvest {

    @OneToOne(cascade = CascadeType.REFRESH)
    private Stock bindStock;


    @Override
    public String type() {
        return "invest-stock";
    }

    @Override
    public String displayName() {
        return "购买股票";
    }
}
