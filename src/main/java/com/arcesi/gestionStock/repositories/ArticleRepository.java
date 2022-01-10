package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.ArticleBean;

@Repository
public interface ArticleRepository extends JpaRepository<ArticleBean, Long> {

}
