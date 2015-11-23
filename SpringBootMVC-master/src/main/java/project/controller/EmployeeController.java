package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import project.persistence.entities.Employee;
import project.persistence.entities.Training;
import project.persistence.entities.WorkSchedule;
import project.service.EmployeeService;
import project.service.TrainingService;
import project.service.WorkScheduleService;

@Controller
public class EmployeeController {
	EmployeeService employeeService; 
	TrainingService trainingService; 
	WorkScheduleService workScheduleService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService, TrainingService trainingService, WorkScheduleService workScheduleService){
	    this.employeeService = employeeService;
	    this.trainingService = trainingService;
	    this.workScheduleService = workScheduleService;
	}
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
    	return "Home";
    }
    // Request mapping is the path that you want to map this method to
    // In this case, the mapping is the root "/", so when the project
    // is running and you enter "localhost:8080" into a browser, this
    // method is called
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        // The string "Index" that is returned here is the name of the view
        // (the Index.jsp file) that is in the path /main/webapp/WEB-INF/jsp/
        // If you change "Index" to something else, be sure you have a .jsp
        // file that has the same name
        return "Index";
    }
    
    @RequestMapping(value = "/home/workSchedule", method = RequestMethod.GET)
    public String WorkSchedules(Model model){
    	List<WorkSchedule> workSchedule = workScheduleService.findAll();
    	model.addAttribute("workSchedule", workSchedule);
    	
    	return "WorkSchedule";
    }
    
    @RequestMapping(value = "/home/workScheduleList/{workScheduleID}", method = RequestMethod.GET)
    public String WorkSchedule(@PathVariable Long workScheduleID, Model model){
    	WorkSchedule workSchedule = workScheduleService.findOne(workScheduleID);
    	model.addAttribute("workSchedule", workSchedule);
    	
    	return "WorkSchedule";
    }
    
    @RequestMapping(value = "/home/training", method = RequestMethod.GET)
    public String Training(Model model){
    	List<Training> training = trainingService.findAll();
    	model.addAttribute("training", training);
    	return "Training";
    }
    
    @RequestMapping(value = "/home/employee", method = RequestMethod.GET)
    public String Employees(Model model){
    	List<Employee> employee = employeeService.findAll();
    	model.addAttribute("employee", employee);
    	
    	return "Employee";
    }

}

