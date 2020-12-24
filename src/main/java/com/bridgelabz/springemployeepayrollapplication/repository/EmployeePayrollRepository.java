package com.bridgelabz.springemployeepayrollapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.springemployeepayrollapplication.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

}
