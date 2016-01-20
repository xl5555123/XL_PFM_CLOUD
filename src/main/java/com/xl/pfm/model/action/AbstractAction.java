package com.xl.pfm.model.action;

import com.xl.pfm.model.BaseItem;
import com.xl.pfm.model.Displayable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 用户行为
 * 不可更新，只可删除
 */
@MappedSuperclass
public abstract class AbstractAction extends BaseItem implements Displayable {

    @Column(nullable = false)
    private String bindAccountType;

    public String getBindAccountType() {
        return bindAccountType;
    }

    public void setBindAccountType(String bindAccountType) {
        this.bindAccountType = bindAccountType;
    }

    public Long getBindAccountId() {
        return bindAccountId;
    }

    public void setBindAccountId(Long bindAccountId) {
        this.bindAccountId = bindAccountId;
    }

    /**
     * 行为所绑定的账户
     * 转账行为绑定为到达账户
     */
    @Column(nullable = false)
    private Long bindAccountId;

}
