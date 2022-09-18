package com.BankPro.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.BankPro.System.entities.Customer;
import com.BankPro.System.repo.Myrepo;

@org.springframework.stereotype.Service
public class MyService {

	@Autowired
	private Myrepo myrepo ;
	
	public List<Customer> getall()
	{
		List<Customer> list=myrepo.findAll();
		return list;
	}
	
	public Customer delbyId(int id)
	{
		Customer cust =myrepo.findById(id).orElseThrow(()-> new RuntimeException());
		myrepo.delete(cust);
		return cust;
	}
	
	public Customer findbyId(int id)
	{
		Customer cust =myrepo.findById(id).orElseThrow(()-> new RuntimeException());
		
		return cust;
	}
	
	public Customer createcust(Customer cust)
	{
		myrepo.save(cust);
		
		return cust;
	}
	
	public Customer update(Customer cust, int id)
	{
		Customer c1;
		c1 =myrepo.findById(id).orElseThrow(()-> new RuntimeException());
		
		c1.setName(cust.getName());
		c1.setCustid(cust.getCustid());
		c1.setBranch(cust.getBranch());
		c1.setBalance(cust.getBalance());
		
		myrepo.save(c1);
		
		return c1;
		
		
		
	}
	
	public Customer Withdraw(Double Lastwithdraw,int id)
	{
		Customer c1;
		c1 =myrepo.findById(id).orElseThrow(()-> new RuntimeException());
		c1.setBalance(c1.getBalance()-Lastwithdraw);
		c1.setLastwithdraw(Lastwithdraw);
		myrepo.save(c1);
		return c1;
		
		
	}
	
	public Customer Deposit(Double Lastdeposit,int id)
	{
		Customer c1;
		c1 =myrepo.findById(id).orElseThrow(()-> new RuntimeException());
		c1.setBalance(c1.getBalance()+Lastdeposit);
		c1.setLastdeposit(Lastdeposit);
		myrepo.save(c1);
		return c1;
		
		
	}
	
	
	
	
	
	
	
	
}
