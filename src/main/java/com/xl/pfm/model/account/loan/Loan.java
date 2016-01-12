package com.xl.pfm.model.account.loan;

import com.xl.pfm.model.BaseItem;
import com.xl.pfm.model.money.Money;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Loan extends BaseItem{

    @OneToOne(cascade = CascadeType.REFRESH)
    private Money money;

    @Column(nullable = false)
    private Double ammout;

    @Column(nullable = false)
    private Double rate;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String from;

    @Column(nullable = false)
    private Date start;

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
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
    }

    @Column(nullable = false)
    private Date end;

}
