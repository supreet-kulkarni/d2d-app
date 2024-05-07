package com.d2d.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d2d.model.AmountModel;
import com.d2d.service.AmontService;

@RestController

public class AmountController {
@Autowired

private AmontService service;

@GetMapping("/balence")
public List<AmountModel> findbalence(){
	return service.getAmount();
}

@PutMapping("/update/1")
public AmountModel update(@RequestBody AmountModel amount) {
	return service.update(amount, 1);
 }
}
