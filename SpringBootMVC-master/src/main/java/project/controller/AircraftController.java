package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

import project.persistence.entities.Aircraft;
import project.persistence.entities.Contact;

import project.service.*;

@Controller
public class AircraftController {

    // Instance Variables
    StringManipulationService stringService;
    AircraftService aircraftService;
    ContactService contactService;
    
    // Dependency Injection
    @Autowired
    public AircraftController(StringManipulationService stringService, AircraftService aircraftService, ContactService contactService) {
        this.stringService = stringService;
        this.aircraftService = aircraftService;
        this.contactService = contactService;
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
