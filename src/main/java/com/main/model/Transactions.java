package com.main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {
	
	@Id
	@Column(name = "transactionid")
	private int transactionid;
	@Column(name = "amount")
	private double amount;
	@Column(name = "customerid")
	private String customerid;
	@Column(name = "customername")
	private String customername;
	@Column(name = "receiverid")
	private String receiverid;
	@Column(name = "receivername")
	private String receivername;
	@Column(name = "receiverbic")
	private String receiverbic;
	@Column(name = "receiverbname")
	private String receiverbname;
	@Column(name = "messagecode")
	private String messagecode;
	@Column(name = "transfertype")
	private int transfertype;
	@Column(name = "timestamp")
	private Date timestamp;
	public Transactions(int transactionid, double amount, String customerid, String customername, String receiverid,
			String receivername, String receiverbic, String receiverbname, String messagecode, int transfertype,
			Date timestamp) {
		super();
		this.transactionid = transactionid;
		this.amount = amount;
		this.customerid = customerid;
		this.customername = customername;
		this.receiverid = receiverid;
		this.receivername = receivername;
		this.receiverbic = receiverbic;
		this.receiverbname = receiverbname;
		this.messagecode = messagecode;
		this.transfertype = transfertype;
		this.timestamp = timestamp;
		
	}
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getReceiverid() {
		return receiverid;
	}
	public void setReceiverid(String receiverid) {
		this.receiverid = receiverid;
	}
	public String getReceivername() {
		return receivername;
	}
	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	public String getReceiverbic() {
		return receiverbic;
	}
	public void setReceiverbic(String receiverbic) {
		this.receiverbic = receiverbic;
	}
	public String getReceiverbname() {
		return receiverbname;
	}
	public void setReceiverbname(String receiverbname) {
		this.receiverbname = receiverbname;
	}
	public String getMessagecode() {
		return messagecode;
	}
	public void setMessagecode(String messagecode) {
		this.messagecode = messagecode;
	}
	public int getTransfertype() {
		return transfertype;
	}
	public void setTransfertype(int transfertype) {
		this.transfertype = transfertype;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
