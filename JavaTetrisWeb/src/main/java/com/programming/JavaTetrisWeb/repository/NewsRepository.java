package com.programming.JavaTetrisWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programming.JavaTetrisWeb.models.NewsEntity;

@Repository
public interface NewsRepository extends JpaRepository<NewsEntity, Integer> {
	
}
