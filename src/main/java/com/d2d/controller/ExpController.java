package com.d2d.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d2d.model.ExpModel;
import com.d2d.service.ExpService;

@RestController
public class ExpController {
@Autowired

private ExpService service;

@PostMapping("/addexps")
public List<ExpModel> addexps(@RequestBody List<ExpModel> exps){
	return service.addexp(exps);
}

@GetMapping("/expenditures")
public List<ExpModel> expenditures(){
	return service.getexps();
}
}
