package br.com.ndd.cesar.robo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
}
