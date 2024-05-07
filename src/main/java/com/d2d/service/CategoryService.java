package com.d2d.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d2d.model.CatecoryModel;
import com.d2d.repository.CategoryRepository;

@Service
public class CategoryService {
@Autowired
private CategoryRepository repo;

public CatecoryModel addcategory(CatecoryModel category) {
	return repo.save(category);
}
public List<CatecoryModel> getcategoryes(){
	return repo.findAll();
	}

public CatecoryModel updatecategory(CatecoryModel category) {
	CatecoryModel existingCategory=repo.findById(category.getCategory_id()).orElse(null);
	existingCategory.setCategory_name(category.getCategory_name());
	return repo.save(existingCategory);
}
}
