package com.beauty.web;
import java.util.Date;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beauty.domain.Person;

@RequestMapping("/people")
@Controller
@RooWebScaffold(path = "people", formBackingObject = Person.class)
public class PersonController {
	
	@RequestMapping("/initDB")
	public String initDB () {
		Person admin = new Person();
		admin.setName("Александра");
		admin.setMiddleName("Анатольевна");
		admin.setSurname("Геращенко");
		admin.setUsername("admin");
		admin.setPassword("123456");
		admin.setDateCreate(new Date());
		
		admin.persist();
		
		return "redirect:/";
	}
}
