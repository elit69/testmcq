package com.mcq.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcq.app.helper.DebugHelper;
import com.mcq.app.service.DefinitionService;

@Controller
public class PageController {
	
	@Autowired
	@Qualifier("DefinitionService")
	private  DefinitionService definitionService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap m) {
		m.addAttribute("message", DebugHelper.toJson(definitionService.get(1)));
		return "home";
	}
}
