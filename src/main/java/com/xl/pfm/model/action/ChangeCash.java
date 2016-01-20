package com.xl.pfm.model.action;

import com.xl.pfm.model.Displayable;
import com.xl.pfm.model.assets.investment.cashequivalents.Cash;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * 账户变动
 * Created by XingLiang on 2016/1/13.
 */
@Entity
public class ChangeCash extends AbstractAction implements Displayable {

    @OneToOne(cascade = CascadeType.REFRESH)
    private Cash bindCash;

    /**
     * 初始账户金额
     */
    @Column(nullable = false)
    private Double originAmmout;

    /**
     * 目标账户金额
     */
    @Column(nullable = false)
    private Double sourceAmmout;

    public ChangeCash(Cash bindCash) {
        setBindCash(bindCash);
        setBindAccountId(bindCash.getId());
        setBindAccountType(bindCash.type());
        setOriginAmmout(bindCash.getAmmout());
        setSourceAmmout(bindCash.getAmmout());
    }

    public Cash getBindCash() {
        return bindCash;
    }

    public void setBindCash(Cash bindCash) {
        this.bindCash = bindCash;
    }

    public Double getOriginAmmout() {
        return originAmmout;
    }

    public void setOriginAmmout(Double originAmmout) {
        this.originAmmout = originAmmout;
    }

    public Double getSourceAmmout() {
        return sourceAmmout;
    }

    public void setSourceAmmout(Double sourceAmmout) {
        this.sourceAmmout = sourceAmmout;
    }

    @Override
    public String type() {
        return "change-account";
    }

    @Override
    public String displayName() {
        return "账户变动";
    }
}
