package org.sid.web;

import org.sid.metier.EtudiantBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtudiantController {
	
	@Autowired
	EtudiantBean etudiantBean ;
	
	@RequestMapping(value="/etudiant")
	public String addEtu(@RequestParam(value="ab")String code,Model model){
		
		model.addAttribute("ab", code) ;
		model.addAttribute("tout") ;
		etudiantBean.ajouterUser();
		
		return "home" ;
	}

}
