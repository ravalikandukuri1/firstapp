package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    /* List added employees. */
    @RequestMapping(value="/listEmployee", method=RequestMethod.GET)
    public String listEmployeeList(Model model) {
        List<Employee> employeeList = employeeRepository.findAll();

        
        model.addAttribute(ConstantVariable.EMPLOYEE_LIST, employeeList);

        return "listEmployee";
    }

    /* Display add employee form page. */
    @RequestMapping(value="/addEmployeePage", method=RequestMethod.GET)
    public String addEmployeePage() {
        return "addEmployee";
    }

    /* Add user submitted employee info to h2 databae and redirect to list employees page. */
    @RequestMapping(value="/addEmployee", method=RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/employee/listEmployee";
    }
}
