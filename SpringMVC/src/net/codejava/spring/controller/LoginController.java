package net.codejava.spring.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.dao.LoginDAO;
import net.codejava.spring.model.Login; 

@Controller
public class LoginController {

	@Autowired
	private LoginDAO loginDAO;
	
	
	@RequestMapping(value="/")
	public ModelAndView mainPage(ModelAndView model) throws IOException {
		
		model.setViewName("login");
		
		return model;
		
	}
	
	@RequestMapping(value="/check")
	public ModelAndView checkUsuario(ModelAndView model, @ModelAttribute Login login) throws IOException {
				
		
		if (login.getUsuario() == null || login.getUsuario().isEmpty() || login.getSenha() == null || login.getSenha().isEmpty()) {
			model.addObject("erro", "Usuário ou senha inválidos");
			model.setViewName("login");
		}
		else {
			Login database = loginDAO.recuperaLogin(login.getUsuario());
			
			if(database.getUsuario() == null) {
				model.addObject("erro", "Usuário ou senha inválidos");
				model.setViewName("login");
				
				return model;
			}
			
			if(database.getUsuario().equalsIgnoreCase(login.getUsuario()) && database.getSenha().equalsIgnoreCase(login.getSenha())) {
				return new ModelAndView("index");
			}
		}
		
		model.setViewName("login");
		
		return model;
	}
}
