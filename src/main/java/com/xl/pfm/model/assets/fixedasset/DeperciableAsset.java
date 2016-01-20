package com.xl.pfm.model.assets.fixedasset;

import com.xl.pfm.model.Money;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 折旧资产
 * 年化折旧时间
 * Created by XingLiang on 2016/1/19.
 */
@Entity
public class DeperciableAsset extends FixedAsset {

    @Column(nullable = false)
    private Double deperciableRate;

    @Column(nullable = false)
    private Double currentValue;

    @Column(nullable = false)
    private Double exceptedFinalValue;

    @Column(nullable = false)
    private Integer exceptedUsedYear;

    public DeperciableAsset() {

    }

    public Double getDeperciableRate() {
        return deperciableRate;
    }

    public void setDeperciableRate(Double deperciableRate) {
        this.deperciableRate = deperciableRate;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public Double getExceptedFinalValue() {
        return exceptedFinalValue;
    }

    public void setExceptedFinalValue(Double exceptedFinalValue) {
        this.exceptedFinalValue = exceptedFinalValue;
    }

    public Integer getExceptedUsedYear() {
        return exceptedUsedYear;
    }

    public void setExceptedUsedYear(Integer exceptedUsedYear) {
        this.exceptedUsedYear = exceptedUsedYear;
    }

    public DeperciableAsset(Money money, Double value, Double exceptedFinalValue, Integer exceptedUsedYear) {
        setBasedMoney(money);
        setPurchasedMoney(value);
        this.exceptedFinalValue = exceptedFinalValue;
        this.exceptedUsedYear = exceptedUsedYear;
        this.currentValue = value;
        this.deperciableRate = (value - exceptedFinalValue) / exceptedUsedYear;
    }
    @Override
    public String type() {
        return "deperciable-asset";
    }
}
