package com.programming.JavaTetrisWeb.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.JavaTetrisWeb.DTO.ForumDTO;
import com.programming.JavaTetrisWeb.exception.ForumNotFoundException;
import com.programming.JavaTetrisWeb.models.ForumEntity;
import com.programming.JavaTetrisWeb.repository.ForumRepository;

@Service
public class ForumService {
	@Autowired
	ForumRepository forumRepository;
	
	public ForumDTO getForumById(Integer id) {
		ForumEntity forumEntity = forumRepository.findById(id).orElseThrow(() -> new ForumNotFoundException(id));		
		return EntitytoDTO(forumEntity);
	}
	
	public void createForum(ForumDTO forumDTO) {
		forumRepository.save(DTOtoEntity(forumDTO));
	}
	
	public List<ForumDTO> getAll() {
		List<ForumDTO> forums = new LinkedList<ForumDTO>();
		forumRepository.findAll().forEach(forum -> forums.add((EntitytoDTO(forum))));
		return forums;
	}
	
	public ForumEntity DTOtoEntity(ForumDTO forumDTO) {
		
		ForumEntity forumEntity = new ForumEntity();
		forumEntity.setForumTitle(forumDTO.getForumTitle());
		forumEntity.setForumContext(forumDTO.getForumContext());
		forumEntity.setComments(forumDTO.getComments());
		
		return forumEntity;
	}
	
	public ForumDTO EntitytoDTO(ForumEntity forumEntity) {
		ForumDTO forumDTO = new ForumDTO();
		forumDTO.setId(forumEntity.getId());
		forumDTO.setForumTitle(forumEntity.getForumTitle());
		forumDTO.setForumContext(forumEntity.getForumContext());
		forumDTO.setComments(forumEntity.getComments());
		
		return forumDTO;
	}
	
	
}
