package com.xl.pfm.model.assets.investment.bond;

import com.xl.pfm.model.Money;
import com.xl.pfm.model.assets.investment.Investment;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by XingLiang on 2016/1/19.
 */
@Entity
public class Bond extends Investment {

    @Override
    public String type() {
        return "bond";
    }

    @Column(nullable = false)
    private Date startTime;

    @Column(nullable = false)
    private Date expiredTime;

    @Column(nullable = false)
    private Double ratePerYear;//百分制

    public Bond(Money money, Double howMuch, Date startTime, Date expiredTime, Double rate) {
        super();
        setCost(howMuch);
        setBasedMoney(money);
        this.startTime = startTime;
        this.expiredTime = expiredTime;
        this.ratePerYear = rate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
        update();
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
        update();
    }

    public Double getRatePerYear() {
        return ratePerYear;
    }

    public void setRatePerYear(Double ratePerYear) {
        this.ratePerYear = ratePerYear;
        update();
    }

    @Override
    public String displayName() {
        return "债券";
    }
}
