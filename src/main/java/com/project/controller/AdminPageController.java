package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminPageController {

	@GetMapping({"/dashboard","/"})
	public String dashboardPage() {
		return "admin/dashboard";
	}
	
}
