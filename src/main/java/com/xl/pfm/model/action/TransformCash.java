package com.xl.pfm.model.action;

import com.xl.pfm.model.assets.investment.cashequivalents.Cash;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;

/**
 * Created by XingLiang on 2016/1/13.
 */
public class TransformCash extends AbstractAction {

    @OneToOne(cascade = CascadeType.REFRESH)
    private Cash originCashAccount;

    @OneToOne(cascade = CascadeType.REFRESH)
    private Cash targetCashAccount;

    @Column(nullable = false)
    private Double ammount;

    public TransformCash(Cash originCashAccount, Cash targetCashAccount, Double ammount) {
        setOriginCashAccount(originCashAccount);
        setTargetCashAccount(targetCashAccount);
        setAmmount(ammount);
        setBindAccountType(targetCashAccount.type());
        setBindAccountId(targetCashAccount.getId());
    }

    public Cash getOriginCashAccount() {
        return originCashAccount;
    }

    public void setOriginCashAccount(Cash originCashAccount) {
        this.originCashAccount = originCashAccount;
    }

    public Cash getTargetCashAccount() {
        return targetCashAccount;
    }

    public void setTargetCashAccount(Cash targetCashAccount) {
        this.targetCashAccount = targetCashAccount;
    }

    public Double getAmmount() {
        return ammount;
    }

    public void setAmmount(Double ammount) {
        this.ammount = ammount;
    }

    @Override
    public String type() {
        return "transform-cash";
    }

    @Override
    public String displayName() {
        return "转账";
    }
}
