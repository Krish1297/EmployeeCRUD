package com.Employee.EmployeeCRUD.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_TBL")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String desgn;
    private String location;

}
