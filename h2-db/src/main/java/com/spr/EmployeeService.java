package com.spr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService{
	
    @Autowired
	EmployeeRepository employeeRepository;
    
    public List<Employee> getAllEmployee(){
    	List<Employee> employees = new ArrayList<Employee>();
    	employeeRepository.findAll().forEach(employee-> employees.add(employee));
    	return employees;
    }
    
    public Employee getEmployeeById(int id) {
    	return employeeRepository.findById(id).get();
    }
    
    public void saveOrUpdate(Employee employee) {
    	employeeRepository.save(employee);
    }
    
    public void delete(int id) {
    	employeeRepository.deleteById(id);
    }
    
    
}
