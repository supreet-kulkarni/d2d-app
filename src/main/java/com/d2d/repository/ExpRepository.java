package com.d2d.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d2d.model.ExpModel;

public interface ExpRepository extends JpaRepository<ExpModel, Integer> {

}
