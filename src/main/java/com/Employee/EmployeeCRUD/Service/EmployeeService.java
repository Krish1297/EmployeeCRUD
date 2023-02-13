package com.Employee.EmployeeCRUD.Service;

import com.Employee.EmployeeCRUD.Entity.Employee;
import com.Employee.EmployeeCRUD.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees){
        return repository.saveAll(employees);
    }


    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }

    public Employee getEmployeeById(int id){
        return repository.findById(id).orElse(null);
    }

    public Employee getEmployeeByName(String name){
        return repository.findByName(name);
    }

    public String deleteEmployee(int id){
        repository.deleteById(id);
        return "Employee: "+id+" is removed";
    }

    public Employee updateEmployee(Employee emp){
        Employee existingEmployee = repository.findById(emp.getId()).orElse(null);
        existingEmployee.setDesgn(emp.getDesgn());
        existingEmployee.setName(emp.getName());
        existingEmployee.setLocation(emp.getLocation());
        return repository.save(existingEmployee);
    }
}
