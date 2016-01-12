package com.xl.pfm.model.account;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by XingLiang on 2016/1/12.
 */
@Entity
public class Stock {

    @GeneratedValue
    @Id
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String name;

    private Integer ammount;



}
