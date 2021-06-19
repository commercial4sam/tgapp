package com.aks.akh.tgf.rangan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HealthCheckController {

	@RequestMapping(value="/healthCheck", method = RequestMethod.GET)
	public String healthCheck(){
		
		
		return "success";
	}
	
}
