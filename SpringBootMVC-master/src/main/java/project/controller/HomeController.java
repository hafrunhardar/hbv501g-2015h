package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import project.service.StringManipulationService;
import project.persistence.entities.Aircraft;
import project.service.*;

@Controller
public class HomeController {

    // Instance Variables
    StringManipulationService stringService;
    AircraftService aircraftService;

    // Dependency Injection
    @Autowired
    public HomeController(StringManipulationService stringService, AircraftService aircraftService) {
        this.stringService = stringService;
        this.aircraftService = aircraftService;
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
    

    // To call this method, enter "localhost:8080/user" into a browser
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user(Model model){

        // Here we will show how to add attributes to a model and send it to the view

        // Since this small example is for a user, let's create some attributes
        // that users might usually have in a system
        String name = "Rincewind";
        String job  = "Wizzard";
        String email = "rincewizz@unseenuni.edu";
        String description = "most likely to survive in a dungeon dimension.";


        // Since we want our attributes regarding the user always in the same format,
        // we are going to convert some strings using our StringManipulationService

        // Let's assume that the name, job and description always have
        // the first character in upper case
        name = stringService.convertsFirstCharInStringToUpperCase(name);
        job = stringService.convertsFirstCharInStringToUpperCase(job);
        description = stringService.convertsFirstCharInStringToUpperCase(description);

        // Let's assume that we always want e-mail in lower case
        email = stringService.convertStringToLowerCase(email);


        // Now let's add the attributes to the model
        model.addAttribute("name",name);
        model.addAttribute("job",job);
        model.addAttribute("email",email);
        model.addAttribute("description",description);

        // By adding attributes to the model, we can pass information from the controller
        // to the view (the .jsp file).
        // Look at the User.jsp file in /main/webapp/WEB-INF/jsp/ to see how the data is accessed
        return "User";
    }
    
    @RequestMapping(value = "home/employee", method = RequestMethod.GET)
    public String employee(Model model){
    	return "Employee";
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model){
    	return "Home";
    }
    
    @RequestMapping(value = "/home/training", method = RequestMethod.GET)
    public String Training(Model model){
    	return "Training";
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
    	return "Contact";
    }
    
    @RequestMapping(value = "/home/workSchedule", method = RequestMethod.GET)
    public String WorkSchedule(Model model){
    	return "WorkSchedule";
    }
/*
    @RequestMapping(value = "/home/workSchedule", method = RequestMethod.GET)
    public String WorkSchedules(Model model){
    	List<WorkSchedule> workSchedule = WorkScheduleService.findAll();
    	model.addAttribute("workSchedule", workSchedule);
    	
    	return "workSchedule";
    }
    
    @RequestMapping(value = "/home/workScheduleList/{workScheduleID}", method = RequestMethod.GET)
    public String WorkSchedule(@PathVariable Long workScheduleID, Model model){
    	WorkSchedule workSchedule = workScheduleService.findOne(workScheduleID);
    	model.addAttribute("workSchedule", workSchedule);
    	
    	return "WorkSchedule";
    }
*/
}
