package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmplooyeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDoaImpl {

    @Autowired
    EmplooyeeRepo emplooyeeRepo;

    public Employee signUp(Employee employee)
    {
        return emplooyeeRepo.save(employee);
    }

    public boolean signIn(String empEmailId, String empPassword)
    {
        boolean flag=false;

        List<Employee> employeeList= emplooyeeRepo.findAll();

        for(Employee employee: employeeList)
        {
            if(employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword))
            {
                flag=true;
            }
        }

        return flag;
    }

    public void saveAllData(List<Employee> employees)
    {
        for(Employee emp: employees)
        {
            emplooyeeRepo.save(emp);
        }

    }



    public Employee getDataByName(String empName)
    {
        return emplooyeeRepo.findByEmpName(empName);
    }

    public Employee getDataByEmailId(String empEmailId)
    {
        return emplooyeeRepo.findByEmpEmailId(empEmailId);
    }

    public List<Employee> getAllData()
    {
        return emplooyeeRepo.findAll();
    }

    public Employee updateData(Employee employee)
    {
        return  emplooyeeRepo.save(employee);
    }

    public void deleteDataById(int empId)
    {
        emplooyeeRepo.deleteById(empId);
    }

    public void deleteAllData()
    {
        emplooyeeRepo.deleteAll();
    }

}
