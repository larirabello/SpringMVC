package net.codejava.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.codejava.spring.dao.ContactDAO;
import net.codejava.spring.dao.PersonDao;
import net.codejava.spring.model.Contact;
import net.codejava.spring.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * This controller routes accesses to the application to the appropriate
 * hanlder methods. 
 * @author www.codejava.net
 *
 */
@Controller // a annotation sai de uma biblioteca, vem da lib spring-context ...(uma das frameworks da Spring). O Spring vê o controller e coloca no container.
public class PersonController {

	@Autowired
	private PersonDao personDao; 
	// dentro do container HomeController tem contactDAO. Assim, o contactDAO precisa estar uma annotation ou configurado no web.xml - ou não existe. Implementei annotation no contactDAOImpl
	
	
	@RequestMapping(value="/person")
	public ModelAndView listPerson(ModelAndView model) throws IOException {
		List<Person> listPerson = personDao.selectAll();
		model.addObject("person", listPerson);
		model.setViewName("person");
		
		return model;
	}
	

	
}
