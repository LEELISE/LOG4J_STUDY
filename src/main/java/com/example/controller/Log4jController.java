package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.service.LogService;

@Controller
public class Log4jController {
    private static final Logger logger = Logger.getLogger(Log4jController.class);

    private final LogService logService;

    public Log4jController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/")
    public String hello() {
        return "redirect:/log4jExample";
    }

    @GetMapping("/log4jExample")
    public String logExample(Model model) {
        logger.debug("DEBUG: Controller called /log4jExample");
        logService.logActions(); // Service 호출

        model.addAttribute("message", "Logs have been generated.");
        return "log4jExample";
    }
}
