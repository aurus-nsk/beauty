package com.beauty.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import javax.persistence.OneToOne;

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
     */
    @NotNull
    private BigDecimal currency;

    /**
     */
    @NotNull
    private BigDecimal totalSumDollars;

    /**
     */
    @NotNull
    private BigDecimal totalSumRubles;
}
