package com.d2d.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="expenditures_tb")
public class ExpModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int exp_id;
private String edate;
private String category;
private int amount;

public ExpModel() {
	super();
}

public ExpModel(int exp_id, String edate, String category, int amount) {
	super();
	this.exp_id = exp_id;
	this.edate = edate;
	this.category = category;
	this.amount = amount;
}

public int getExp_id() {
	return exp_id;
}

public void setExp_id(int exp_id) {
	this.exp_id = exp_id;
}

public String getEdate() {
	return edate;
}

public void setEdate(String edate) {
	this.edate = edate;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}


}
