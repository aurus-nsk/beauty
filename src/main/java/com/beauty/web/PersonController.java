package com.beauty.web;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beauty.domain.Person;

@RequestMapping("/people")
@Controller
@RooWebScaffold(path = "people", formBackingObject = Person.class)
@Transactional
public class PersonController {
	
	private static Logger log = Logger.getLogger(PersonController.class);
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	@RequestMapping("/initDB")
	public String initDB () {
		
		Person admin = new Person();
		admin.setName("Александр");
		admin.setMiddleName("");
		admin.setSurname("Геращенко");
		admin.setUsername("admin1");
		admin.setPassword("123456");
		admin.setDateCreate(new Date());
		admin.persist();
		admin.flush();
		
		return "redirect:/";
	}
	
	@RequestMapping("/check")
	public String check() {
		EntityManager em = Person.entityManager();
		log.debug("EntityManager: " + em);
		if (em != null) {
			try {
				EntityTransaction et = em.getTransaction();
				log.debug("EntityTransaction: " + et);
			} catch (Exception e) {
				log.debug(e);
			}
		}
		log.debug("CountPeople: " + Person.countPeople());
		return "/";
	}
}