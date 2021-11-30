package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/signup")
    public Employee signUp(@RequestBody Employee employee){
     return employeeService.signUp(employee);
    }

    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public boolean empSignIn(@PathVariable String empEmailId, @PathVariable String empPassword){

        return  employeeService.signIn(empEmailId,empPassword);
    }
    @PostMapping("/savealldata")
    public String saveAllData(@RequestBody List<Employee> employees){
         employeeService.saveAllData(employees);
         return "Save All data sucessFully";
    }
    @GetMapping("/getedatabyname/{empName}")
    public Employee getDataByName(@PathVariable String empName)
    {
        return employeeService.getDataByName(empName);
    }

    @GetMapping("/getdatabyemailid/{empEmailId}")
    public Employee getDataByemailId(@PathVariable String empEmailId){

        return employeeService.getDataByEmailId(empEmailId);
    }

    @GetMapping("/getalldata")
    public List<Employee> getAllData()
    {
        return employeeService.getAllData();
    }
    @PutMapping("/updatedata/{empId}")
    public Employee updateData(@PathVariable int empId, @RequestBody Employee employee)
    {


        return employeeService.updateData(employee);
    }

    @DeleteMapping("/deletedatabyid/{empId}")
    public String deleteDataById(@PathVariable int empId)
    {
        employeeService.deleteDataById(empId);
        return "data deleted successfully";
    }

    @DeleteMapping("/deletealldata")
    public String deleteAllData()
    {
        employeeService.deleteAllData();
        return "All Data Deleted Successfully";
    }

}
