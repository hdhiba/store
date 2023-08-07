package tn.csf.store.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.store.model.Article;






//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  