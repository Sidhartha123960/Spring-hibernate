package com.sidhartha.hiber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.sidhartha.hiber.Respository.EmployeeRepo;
import com.sidhartha.hiber.entity.Employee;

import java.io.Serializable;
import java.util.*;




@Service
public class employeeservice 
{
	   @Autowired    
	   private EmployeeRepo repo;

	public employeeservice(EmployeeRepo repo) 
	{
		this.repo = repo;
	}
    
	@Transactional
	public Employee saveemployee(Employee emp)
	{
		return repo.saving(emp);
	}
	
	
	public List<Employee> getallemployee()
	{
		return repo.get();
	}
	   	
}