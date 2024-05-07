package com.d2d.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d2d.model.AmountModel;

public interface AmountRepository extends JpaRepository<AmountModel, Integer>{

}
