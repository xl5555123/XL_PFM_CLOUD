package com.xl.pfm.model;


import com.xl.pfm.model.BaseDisplayItem;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 货币对象
 */
@Entity
public class Money extends BaseDisplayItem {

    /**
     * 货币的唯一标识
     */
    @Column(nullable = false)
    private String key;

    /**
     * 货币的当前价格(以美元计)
     */
    @Column(nullable = false)
    private Double currentValue;

    @Column(nullable = false)
    private String displayName;

    public Money() {
        super();
    }

    public Money(String key, Double currentValue) {
        super();
        this.key = key;
        this.currentValue = currentValue;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public String type() {
        return "money";

    }

    @Override
    public String displayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
