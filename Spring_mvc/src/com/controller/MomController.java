package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Component
@Controller
public class MomController 
{
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar()
	{
		return "here is your sugar......";
	}

}
