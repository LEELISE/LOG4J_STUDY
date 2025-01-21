package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Log4jController {
	private static final Logger logger = Logger.getLogger(Log4jController.class);

	@GetMapping("/")
	public String hello() {
		return "redirect:/log4jExample";
	}

	@GetMapping("/log4jExample")
	public String logExample(Model model) {
		logger.debug("DEBUG level log message");
		logger.info("INFO level log message");
		logger.warn("WARN level log message");
		logger.error("ERROR level log message");

		model.addAttribute("message", "Check the logs for Log4j output.");
		return "log4jExample";
	}
}
