package com.d2d.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category_tb")
public class CatecoryModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue

private int  category_id;
private String  category_name;

public CatecoryModel() {
	super();
}

public CatecoryModel(int category_id, String category_name) {
	super();
	this.category_id = category_id;
	this.category_name = category_name;
}

public int getCategory_id() {
	return category_id;
}

public void setCategory_id(int category_id) {
	this.category_id = category_id;
}

public String getCategory_name() {
	return category_name;
}

public void setCategory_name(String category_name) {
	this.category_name = category_name;
}


}
