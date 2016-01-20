package com.xl.pfm.model.assets.investment.stock;

import com.xl.pfm.model.Money;
import com.xl.pfm.model.assets.investment.Investment;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Stock extends Investment {

    @Column(nullable = false)
    private Integer share;

    @Column(nullable = false)
    private Double prizePerShare;

    @Column(nullable = false)
    private Double costPerShare;

    @Column(nullable = false)
    private String stockId;

    @Column(nullable = false)
    private String stockName;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public Stock() {
        super();
    }

    public Stock(Money money, Integer share, Double costPerShare) {
        super();
        setBasedMoney(money);
        this.share = share;
        this.costPerShare = costPerShare;
        this.prizePerShare = costPerShare;
    }


    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    public Double getPrizePerShare() {
        return prizePerShare;
    }

    public void setPrizePerShare(Double prizePerShare) {
        this.prizePerShare = prizePerShare;
    }

    public Double getCostPerShare() {
        return costPerShare;
    }

    public void setCostPerShare(Double costPerShare) {
        this.costPerShare = costPerShare;
        update();
    }

    @Override
    public String type() {
        return "stock";
    }

    @Override
    public String displayName() {
        return String.format("股票%s", stockName);
    }
}
