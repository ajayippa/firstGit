package com.ajay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddController {
	@ResponseBody
	@RequestMapping("/add")
	public String add()
	{
		
		return "display.jsp";
	}
}