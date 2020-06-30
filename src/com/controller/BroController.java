package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController 
{
	
	@RequestMapping("/bat")
	public String giveBat(ModelMap model)
	{
		//	return "hey...take this bat and hit century...";
	
		model.addAttribute("msg", "sachin was using this bat...");
		
		return "MRFCricketBat";		
	}

}
