package com.beauty.domain;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@Table(name = "BeautyOrder")
public class BeautyOrder {

    @OneToOne
    private Person person;

    private String shopName;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date dateCreate;
    
    @NotNull
    @Size(min = 2)
    private String productName;

    private String colour;

    private String sizeName;

    @NotNull
    private BigDecimal priceOriginDollars;

    @NotNull
    private BigDecimal priceOrgSaleDollars;

    @NotNull
    private BigDecimal taxDollars;

    private BigDecimal deliveryUsaDollars;

    @NotNull
    private BigDecimal totalDollars;
    
    @NotNull
    private BigDecimal currency;

    @NotNull
    private BigDecimal totalRubles;

    @NotNull
    private Integer weight;
    
    @NotNull
    private BigDecimal priceOfKgDollars;

    @NotNull
    private BigDecimal deliveryRussiaDollars;

    @NotNull
    private BigDecimal currencyDelivery;
    
    @NotNull
    private BigDecimal deliveryRussiaRubles;

    @NotNull
    private BigDecimal totalSumRubles;
}