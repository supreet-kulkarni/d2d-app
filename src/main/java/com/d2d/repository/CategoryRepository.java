package com.d2d.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d2d.model.CatecoryModel;

public interface CategoryRepository extends JpaRepository<CatecoryModel, Integer> {

}
