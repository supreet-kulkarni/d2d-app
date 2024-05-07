package com.d2d.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="amount_tb")
public class AmountModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue
private int id;
private int amount;

public AmountModel() {
	super();
}

public AmountModel(int id, int amount) {
	super();
	this.id = id;
	this.amount = amount;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}




}
