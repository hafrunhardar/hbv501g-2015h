package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

import project.persistence.entities.Aircraft;
import project.persistence.entities.Employee;
import project.persistence.entities.Contact;
import project.persistence.entities.Training;
import project.persistence.entities.WorkSchedule;

import project.service.*;

@Controller
public class HomeController {

    // Instance Variables
    StringManipulationService stringService;
    AircraftService aircraftService;
    EmployeeService employeeService;
    ContactService contactService;
    TrainingService trainingService;
    WorkScheduleService workScheduleService;
    
    // Dependency Injection
    @Autowired
    public HomeController(StringManipulationService stringService, AircraftService aircraftService, EmployeeService employeeService, ContactService contactService, TrainingService trainingService, WorkScheduleService workScheduleService) {
        this.stringService = stringService;
        this.aircraftService = aircraftService;
        //this.employeeService = employeeService;
        //this.trainingService = trainingService;
        //this.workScheduleService = workScheduleService;
        this.contactService = contactService;
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
    
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String home(){
        return "Home";
    }

    
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
    	return "Home";
    }
    
    @RequestMapping(value = "/home/aircraftList", method = RequestMethod.GET)
    public String Aircrafts(Model model){
    	List<Aircraft> aircraft = aircraftService.findAll();
    	model.addAttribute("aircraft", aircraft);
    	
    	return "AircraftList";
    }
    
    @RequestMapping(value = "/home/aircraftList/{aircraftID}", method = RequestMethod.GET)
    public String Aircraft(@PathVariable Long aircraftID, Model model){
    	Aircraft aircraft = aircraftService.findOne(aircraftID);
    	model.addAttribute("aircraft", aircraft);
    	
    	return "Aircraft";
    }

    @RequestMapping(value = "/home/contact", method = RequestMethod.GET)
    public String Contact(Model model){
    	List<Contact> contact = contactService.findAll();
    	model.addAttribute("contact", contact);
    	return "Contact";
    }
    
}
