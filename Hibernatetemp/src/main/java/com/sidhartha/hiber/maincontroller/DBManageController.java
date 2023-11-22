package com.sidhartha.hiber.maincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sidhartha.hiber.service.employeeservice;
import com.sidhartha.hiber.entity.*;
import java.util.*;


@RestController
@RequestMapping("/employee")
public class DBManageController 
{

	  @Autowired
      private employeeservice service;
	   
	  @PostMapping
	  public ResponseEntity<Employee> create(@RequestBody Employee emp)
	  {
		  return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.saveemployee(emp));
	  }
	  
	  @GetMapping
	  public ResponseEntity<List<Employee>> getallemp()
	  {
		  List<Employee> emp = service.getallemployee();
		  return ResponseEntity.status(HttpStatus.OK).body(emp);
	  }
	    
}