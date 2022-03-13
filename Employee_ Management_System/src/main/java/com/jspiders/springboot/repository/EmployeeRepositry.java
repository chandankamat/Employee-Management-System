package com.jspiders.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.springboot.entity.Employee;

@Repository
public interface EmployeeRepositry extends JpaRepository<Employee,Long> {


}
