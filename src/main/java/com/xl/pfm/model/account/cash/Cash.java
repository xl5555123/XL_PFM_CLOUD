package com.xl.pfm.model.account.cash;

import com.xl.pfm.model.BaseItem;
import com.xl.pfm.model.money.Money;

import javax.persistence.*;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Cash extends BaseItem {

    @Column(nullable = false)
    private Double ammout;

    @OneToOne(cascade = CascadeType.REFRESH)
    private Money money;

    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        update();
    }

    public Double getAmmout() {
        return ammout;
    }

    public void setAmmout(Double ammout) {
        this.ammout = ammout;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
        update();
    }
}
