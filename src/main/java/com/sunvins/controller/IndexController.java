package com.sunvins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")      
	public String getIndex() {
		return "index";
	}
	@RequestMapping("/calendar")      
	public String getCalendar() {
		return "calendar";
	}
	@RequestMapping("/buttons")      
	public String getButtons() {
		return "buttons";
	}
	@RequestMapping("/editors")      
	public String getEditors() {
		return "editors";
	}
	@RequestMapping("/form")      
	public String getForm() {
		return "form";
	}
	@RequestMapping("/login")      
	public String getLogin() {
		return "login";
	}
	@RequestMapping("/stats")      
	public String getStats() {
		return "stats";
	}
	@RequestMapping("/tables")      
	public String getTables() {
		return "tables";
	}
	@RequestMapping("/interface")      
	public String getInterface() {
		return "interface";
	}
}
