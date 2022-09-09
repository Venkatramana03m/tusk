package com.webapp.springbboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class velcomecontroller {
	
	@GetMapping("/velcome")
      public String velcome(Model model) {
		model.addAttribute("messagev","hii");
    	  return "hello";
      }
}
