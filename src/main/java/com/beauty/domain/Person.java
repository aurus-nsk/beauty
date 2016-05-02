package com.beauty.domain;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

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
}
