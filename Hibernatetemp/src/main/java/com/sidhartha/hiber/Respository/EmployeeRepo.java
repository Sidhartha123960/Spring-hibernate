package com.sidhartha.hiber.Respository;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.sidhartha.hiber.entity.Employee;

import java.io.Serializable;
import java.util.*;

import javax.transaction.Transactional;

@Repository
public class EmployeeRepo 
{
    private HibernateTemplate template;

	public EmployeeRepo(HibernateTemplate template) {
	
		this.template = template;
	}

	public Employee saving(Employee entity) 
	{
       
	    Serializable id = template.save(entity);
	    return template.get(Employee.class, id);
    }


    public List<Employee> get() 
    {
        return template.loadAll(Employee.class);
    }
}