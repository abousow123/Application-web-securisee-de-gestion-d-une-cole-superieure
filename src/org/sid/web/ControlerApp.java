package org.sid.web;

import org.sid.dao.IUeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControlerApp {

	@Autowired
	private IUeDao iUeDao ;
	
	@RequestMapping(value="/index")
	public String index(){
		return "Trans" ;
	}
}
