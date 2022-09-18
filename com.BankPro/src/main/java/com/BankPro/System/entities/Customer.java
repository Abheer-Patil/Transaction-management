package com.BankPro.System.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int custid;
	@Column(name = "Name")
	private String name;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "Balance")
	private double balance = 500;
	private double Lastwithdraw;
	private double Lastdeposit;

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLastwithdraw() {
		return Lastwithdraw;
	}

	public void setLastwithdraw(double lastwithdraw) {
		Lastwithdraw = lastwithdraw;
	}

	public double getLastdeposit() {
		return Lastdeposit;
	}

	public void setLastdeposit(double lastdeposit) {
		Lastdeposit = lastdeposit;
	}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", branch=" + branch + ", balance=" + balance
				+ ", Lastwithdraw=" + Lastwithdraw + ", Lastdeposit=" + Lastdeposit + "]";
	}

	public Customer(int custid, String name, String branch, double balance, double lastwithdraw, double lastdeposit) {
		super();
		this.custid = custid;
		this.name = name;
		this.branch = branch;
		this.balance = balance;
		Lastwithdraw = lastwithdraw;
		Lastdeposit = lastdeposit;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
