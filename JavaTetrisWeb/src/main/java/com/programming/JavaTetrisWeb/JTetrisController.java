package com.programming.JavaTetrisWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JTetrisController {

	@GetMapping(value = {"/","index"})
	public String getMainPage(Model model) {
		return "index";
	}
	
	@GetMapping(value= {"/news"})
	public String getForumPage(Model model) {
		return "news";
	}
	
	@GetMapping(value={"/forum"})
	public String getInnovationsPage() {
		return "forum";
	}
	
	@GetMapping(value={"/about"})
	public String getAboutPage() {
		return "about";
	}
}
