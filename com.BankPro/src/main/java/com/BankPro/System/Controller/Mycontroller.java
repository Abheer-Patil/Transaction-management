package com.BankPro.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BankPro.System.entities.Customer;
import com.BankPro.System.service.MyService;

@RestController
@RequestMapping("/Bank")
public class Mycontroller
{
	@Autowired
	private MyService ser;
	
	
	@GetMapping("/getall")
	public List<Customer> getall()
	{
		return ser.getall();
	}
	
	@DeleteMapping("/delbyID/{id}")
	public Customer delbyId(@PathVariable int id)
	{
		return ser.delbyId(id);
	}
	
	@GetMapping("/findbyID/{id}")
	public Customer findbyId(@PathVariable  int id)
	{
		Customer cust =ser.findbyId(id);
		return cust;
	}
	
	@PostMapping("/create")
	public Customer createcust(@RequestBody Customer cust)
	{
		Customer c1=ser.createcust(cust);
		return cust;
	}
	
	@PutMapping("/update/{id}")
	public Customer update(@RequestBody Customer cust,@PathVariable int id)
	{
		Customer c1=ser.update(cust, id);
		return c1;
	}
	
	
	@PutMapping("/withdraw/{id}/{Lastwithdraw}")
	public Customer Withdraw(@PathVariable Double Lastwithdraw,@PathVariable int id)
	{
		Customer c1=ser.Withdraw(Lastwithdraw, id);
		return c1;
	}
	
	@PutMapping("/deposit/{id}/{Lastdeposit}")
	public Customer Deposit(@PathVariable Double Lastdeposit,@PathVariable int id)
	{
		Customer c1=ser.Deposit(Lastdeposit, id);
		return c1;
	}
}
