package com.d2d.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d2d.model.CatecoryModel;
import com.d2d.service.CategoryService;

@RestController
public class CategoryController {
@Autowired

private CategoryService service;

@PostMapping("/addcategory")
public CatecoryModel addcategory(@RequestBody CatecoryModel category) {
	return service.addcategory(category);
}

@GetMapping("/categoryes")
public List<CatecoryModel> categoryes(){
	return service.getcategoryes();
}
}
