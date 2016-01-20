package com.xl.pfm.model.action.invest;

import com.xl.pfm.model.assets.investment.cashequivalents.Cash;
import com.xl.pfm.model.action.AbstractAction;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * Created by XingLiang on 2016/1/13.
 */
@MappedSuperclass
public abstract class AbstractInvest extends AbstractAction {

    @OneToOne
    protected Cash bindCash;

    @Column(nullable = false)
    protected String investType;

    public Cash getBindCash() {
        return bindCash;
    }

    public void setBindCash(Cash bindCash) {
        this.bindCash = bindCash;
    }

    public String getInvestType() {
        return investType;
    }

    public void setInvestType(String investType) {
        this.investType = investType;
    }
}
