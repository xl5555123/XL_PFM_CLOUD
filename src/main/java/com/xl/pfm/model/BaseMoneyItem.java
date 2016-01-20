package com.xl.pfm.model;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * 基于某种特定货币的类型
 * Created by XingLiang on 2016/1/19.
 */
@MappedSuperclass
public abstract class BaseMoneyItem extends BaseDisplayItem {

    @OneToOne(cascade = CascadeType.REFRESH, mappedBy = "basedMoneyId")
    protected Money basedMoney;

    public Money getBasedMoney() {
        return basedMoney;
    }

    public void setBasedMoney(Money basedMoney) {
        this.basedMoney = basedMoney;
        update();
    }
}
