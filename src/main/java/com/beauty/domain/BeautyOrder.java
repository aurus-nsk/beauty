package com.beauty.domain;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Entity
@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class BeautyOrder {

    /**
     */
    @OneToOne
    private Person person;

    /**
     */
    private String shopName;

    /**
     */
    @NotNull
    @Size(min = 2)
    private String productName;

    /**
     */
    private String colour;

    /**
     */
    private String sizeName;

    /**
     */
    @NotNull
    private String quantity;

    /**
     */
    @NotNull
    private BigDecimal priceOrigin;

    /**
     */
    @NotNull
    private BigDecimal priceSaleOrg;

    /**
     */
    @NotNull
    private BigDecimal taxDollars;

    /**
     */
    private BigDecimal deliveryUSA;

    /**
     */
    @NotNull
    private BigDecimal totalDollars;

    /**
     */
    @NotNull
    private BigDecimal totalRubles;

    /**
     */
    @NotNull
    private Integer weight;

    /**
     */
    @NotNull
    private BigDecimal deliveryRussiaDollars;

    /**
     */
    @NotNull
    private BigDecimal deliveryRussiaRubles;

    /**
     * currencyPurchase
     */
    @NotNull
    private BigDecimal currency;

    /**
     * currencyDelivery
     */
    @NotNull
    private BigDecimal currencyDelivery;

    /**
     */
    @NotNull
    private BigDecimal totalSumDollars;

    /**
     */
    @NotNull
    private BigDecimal totalSumRubles;

    /**
     */
    @NotNull
    private BigDecimal priceOfKg;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date dateCreate;
}
