package jp.k_ui.thymeleaf.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Sample {

	@RequestMapping("/")
	@ResponseBody
	public String root() {
		return "hello servlet";
	}
	
}
