package com.bridgelabz.springemployeepayrollapplication.service;

import java.util.List;

import com.bridgelabz.springemployeepayrollapplication.dto.EmployeePayrollDTO;
import com.bridgelabz.springemployeepayrollapplication.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

	void deleteEmployeePayrollData(int empId);

}
