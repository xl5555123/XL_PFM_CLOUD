package com.xl.pfm.model.account;

import com.xl.pfm.model.BaseItem;
import com.xl.pfm.model.Displayable;

import javax.persistence.MappedSuperclass;

/**
 * Created by XingLiang on 2016/1/13.
 */
@MappedSuperclass
public abstract class Account extends BaseItem implements Displayable {

}
