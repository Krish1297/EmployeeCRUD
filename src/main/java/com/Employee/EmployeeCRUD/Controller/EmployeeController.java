package com.Employee.EmployeeCRUD.Controller;

import com.Employee.EmployeeCRUD.Entity.Employee;
import com.Employee.EmployeeCRUD.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
            return service.saveEmployee(employee);
    }
    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees){
        return service.saveEmployees(employees);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return service.getAllEmployees();
    }

    @GetMapping("/employeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }

    @GetMapping("/employeeByName/{name}")
    public Employee findEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        return service.deleteEmployee(id);
    }

}
