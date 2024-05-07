package com.d2d.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d2d.model.ExpModel;
import com.d2d.repository.ExpRepository;

@Service
public class ExpService {
@Autowired
private ExpRepository repo;

public List<ExpModel> addexp(List<ExpModel> exps){
	return repo.saveAll(exps);
}

public List<ExpModel> getexps(){
	return repo.findAll();
}

public ExpModel updateexps(ExpModel exps) {
	ExpModel existingexp=repo.findById(exps.getExp_id()).orElse(null);
    existingexp.setEdate(exps.getEdate());
    existingexp.setCategory(exps.getCategory());
    existingexp.setAmount(exps.getAmount());
    return repo.save(existingexp);
 }
}
