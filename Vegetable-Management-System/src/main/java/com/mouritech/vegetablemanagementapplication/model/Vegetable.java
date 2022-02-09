package com.mouritech.vegetablemanagementapplication.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vegetables")
public class Vegetable{
	
	@Id
	@Column(name="veg_id")
	private String vegId;
	
	@Column(name = "custId")
	private Long customerId;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "status")
	private String status;

	public Vegetable() {
		super();
	}
	
	public Vegetable(String vegId, Long customerId, double amount, String status) {
		super();
		this.vegId = vegId;
		this.customerId = customerId;
		this.amount = amount;
		this.status = status;
	}

	public String getVegId() {
		return vegId;
	}

	public void setVegId(String vegId) {
		this.vegId = vegId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Vegetable [vegId=" + vegId + ", customerId=" + customerId + ", amount=" + amount + ", status=" + status+ "]";
	}

}
