package com.csi.service;

import com.csi.dao.EmployeeDoaImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDoaImpl employeeDoa;

    public Employee signUp(Employee employee)
    {
        return employeeDoa.signUp(employee);
    }

    public boolean signIn(String empEmailId, String empPassword)
    {

        return employeeDoa.signIn(empEmailId, empPassword);
    }

    public void saveAllData(List<Employee> employees)
    {
        employeeDoa.saveAllData(employees);

    } public Employee getDataByName(String empName)
    {
        return employeeDoa.getDataByName(empName);
    }

    public Employee getDataByEmailId(String empEmailId)
    {
        return employeeDoa.getDataByEmailId(empEmailId);
    }

    public List<Employee> getAllData()
    {
        return employeeDoa.getAllData();
    }

    public Employee updateData(Employee employee)
    {
        return  employeeDoa.updateData(employee);
    }

    public void deleteDataById(int empId)
    {
        employeeDoa.deleteDataById(empId);
    }

    public void deleteAllData()
    {
        employeeDoa.deleteAllData();
    }


}
