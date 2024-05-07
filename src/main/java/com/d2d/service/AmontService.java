package com.d2d.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d2d.model.AmountModel;
import com.d2d.repository.AmountRepository;

@Service
public class AmontService {
@Autowired
private AmountRepository repo;

public AmountModel getAmountById(int id) {
	return repo.findById(id).orElse(null);
}

public List<AmountModel> getAmount() {
	return repo.findAll();
}

public AmountModel update(AmountModel amount,int id) {
	return repo.save(amount);
}

public AmountModel updateAmount(AmountModel amount) {
	AmountModel existingAmount= repo.findById(amount.getId()).orElse(null);
	existingAmount.setAmount(amount.getAmount());
	return repo.save(existingAmount);
	}
}
