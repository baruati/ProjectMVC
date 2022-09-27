package com.sopra.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sopra {
	@RequestMapping("/name")
	public String home() {
		return "index";
	}

}
