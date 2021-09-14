package com.programming.JavaTetrisWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.programming.JavaTetrisWeb.DTO.ForumDTO;
import com.programming.JavaTetrisWeb.service.ForumService;

@Controller
@RequestMapping(value = {"/forum"})
public class ForumController {

	@Autowired
	ForumService forumService;
	
		
	@GetMapping
	public String getForumPage(Model model) {
		model.addAttribute("forums",forumService.getAll());
		return "forum";
	}
	
	@GetMapping("/{id}")
	public String getForum(@PathVariable Integer id,Model model) {
		model.addAttribute("forum",forumService.getForumById(id));		
		return "forumView";
	}
	
	@PostMapping("/create")
	public String createForum(ForumDTO forumDTO) {
		forumService.createForum(forumDTO);
		return "redirect:/forum";		
	}
	
}
