package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController 
{
	@ResponseBody
	@RequestMapping("/makeupkit")
	public String giveMakeupKit()
	{
		return "hey beautiful..here is my makeup kit...";
	}
	
	@ResponseBody
	@RequestMapping("/eyeliner")
	public String giveEyeLiner()
	{
		return "only eye liner...";
	}

}
