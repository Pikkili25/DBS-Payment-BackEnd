package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

	@Id
	@Column(name = "customerid")
	private String customerid;
	@Column(name = "accountholdername")
	private String accountholdername;
	@Column(name = "clearbalance")
	private double clearbalance;
	@Column(name = "overdraf")
	private String overdraft;
	public Customers(String customerid, String accountholdername, double clearbalance, String overdraft) {
		super();
		this.customerid = customerid;
		this.accountholdername = accountholdername;
		this.clearbalance = clearbalance;
		this.overdraft = overdraft;
	}
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public double getClearbalance() {
		return clearbalance;
	}
	public void setClearbalance(double clearbalance) {
		this.clearbalance = clearbalance;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}
	
	
	
}
