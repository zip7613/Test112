package com.gura.test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
		
	@RequestMapping("/home.do")
	public String home(HttpServletRequest request) {
		List<String> notice=new ArrayList<>();
		notice.add("감기조심");
		notice.add("코로나 조심");
		notice.add("다들 살아 남아요~");
		notice.add("어쩌구...");
		notice.add("저쩌구...");
				
		request.setAttribute("notice", notice);
		
		return "home";
	}
	
}
