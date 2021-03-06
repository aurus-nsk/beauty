package com.beauty.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Entity
@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findPeopleByUsernameAndPasswordEquals" })
public class Person {

    /**
     */
    private String name;

    /**
     */
    private String middleName;

    /**
     */
    private String surname;

    /**
     */
    @NotNull
    private String username;

    /**
     */
    @NotNull
    private String password;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date dateCreate;
}
