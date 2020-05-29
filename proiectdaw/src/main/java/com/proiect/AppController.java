package com.proiect;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {
	
	@Autowired
	 private ProdusService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		
		List<Produs> listProdus=service.listAll();
		model.addAttribute("listProdus", listProdus);
	
		return "index";
	}
	@RequestMapping("/new")
	public String showNewProductForm(Model model) {
		Produs produs = new Produs();
		model.addAttribute("produs", produs);
		
		return "new_product";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("produs") Produs produs) {
		service.save(produs);
		
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{Id}")
	public ModelAndView showEditProductForm(@PathVariable(name = "Id") Long Id) {
		ModelAndView mav = new ModelAndView("edit_product");
		
		
		Produs produs = service.get(Id);
		mav.addObject("produs", produs);
		
		return mav;
	}
	
	@RequestMapping("/delete/{Id}")
	public String deleteProdus(@PathVariable(name = "Id") Long Id) {
		service.delete(Id);
		
		
		return "redirect:/";
	}
	
	
}
