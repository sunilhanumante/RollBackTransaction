package com.BikkadIT.RBT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.RBT.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
