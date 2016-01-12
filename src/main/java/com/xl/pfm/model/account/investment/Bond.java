package com.xl.pfm.model.account.investment;

import com.xl.pfm.model.money.Money;
import org.joda.time.DateTime;
import org.joda.time.Days;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Bond extends AbstractInvestment {

    @Column(nullable = false)
    private Date startTime;

    @Column(nullable = false)
    private Date expiredTime;

    @Column(nullable = false)
    private Double ratePerYear;//百分制


    public Bond(Money money, Date startTime, Date expiredTime, Double rate) {
        super();
        this.tradeMoney = money;
        this.startTime = startTime;
        this.expiredTime = expiredTime;
        this.ratePerYear = rate;
    }

    @Override
    protected void updateMarketValueAndCost() {
        int days = Days.daysBetween(new DateTime(startTime).withTimeAtStartOfDay(), new DateTime(new Date()).withTimeAtStartOfDay()).getDays();

        Double interest = (double) days / 365 * ratePerYear * cost;
        setMarketValue(cost + interest);
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
        updateMarketValueAndCost();
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
        updateMarketValueAndCost();
    }

    public Double getRatePerYear() {
        return ratePerYear;
    }

    public void setRatePerYear(Double ratePerYear) {
        this.ratePerYear = ratePerYear;
        updateMarketValueAndCost();
    }
}
