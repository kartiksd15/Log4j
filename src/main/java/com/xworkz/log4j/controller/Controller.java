package com.xworkz.log4j.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Controller {
	private static final Logger log = Logger.getLogger(Controller.class);

	public Controller() {
		log.info("created:t........." + this.getClass().getSimpleName());

	}

	@RequestMapping("/loging.do")
	public String getLog(Model model) {
		// log.info("getlogin :" + this.getLog(model));
		log.info("grt login:");
		model.addAttribute("Message", "wel come to loger world.");

		return "welCome";
	}

}
