package ru.vitutnev.dmitry.mustache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vitutnev.dmitry.mustache.dao.EmployeeDAO;
import ru.vitutnev.dmitry.mustache.model.Employee;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private EmployeeDAO employeeDAO;


    @RequestMapping("/")
    public String handleRequest(Model model) {

        List<Employee> employees = employeeDAO.getEmployees();
        model.addAttribute("employees", employees);
        return "employee";
    }
}
