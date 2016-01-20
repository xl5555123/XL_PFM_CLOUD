package com.xl.pfm.model.assets.investment.cashequivalents;

import com.xl.pfm.model.assets.investment.Investment;

import javax.persistence.MappedSuperclass;

/**
 * 现金及现金等价物
 * 此物品为可迅速变现的资产
 * 如货币基金、活期存款、外汇等
 * Created by XingLiang on 2016/1/19.
 */
@MappedSuperclass
public abstract class CashAndCashEquivalents extends Investment {
}
