package com.demo.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.entity.Customer;
import com.demo.spring.entity.Requests;

@Controller
public class CustomerController {
	@Autowired
	CustRep repo;

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("req1") Requests req) {
		ModelAndView mv = new ModelAndView();
		List<Customer> c=repo.findAll();
		
		for(Customer i : c) {
			
			if(i.getEmail().equals(req.getCustomer().getEmail())) {
				System.out.println("found");
				mv.setViewName("requests");
			}
		}
		
		return mv;
	}
	@RequestMapping(path = "/requests", method = RequestMethod.GET)
	public String getFirstPage(Model model) {
		Requests e = new Requests();
		model.addAttribute("myemp", e);
		return "index";
	}
}
