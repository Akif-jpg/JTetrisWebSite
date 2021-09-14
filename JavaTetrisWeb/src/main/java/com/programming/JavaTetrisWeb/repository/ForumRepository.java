package com.programming.JavaTetrisWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.JavaTetrisWeb.models.ForumEntity;

@Repository
public interface ForumRepository extends JpaRepository<ForumEntity, Integer>{
	
	public List<ForumEntity> getAllByOrderByIdDesc();

} 
