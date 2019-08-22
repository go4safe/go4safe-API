package com.go4safe.controller;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.go4safe.constants.Constants;
import com.go4safe.model.BikeSearchDetails;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@Validated
@RequestMapping()
@Api(value = "SearchController")
public class SearchController {
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@ApiOperation("Get the searchDetails for Bike")
	@GetMapping(value = Constants.BIKESEARCHDETAILS_LIST_API, produces = "application/json")
	    public List<BikeSearchDetails> searchBike() {
		log.info("Inside method searchBike");		 
		 List<BikeSearchDetails> bsd=new ArrayList<BikeSearchDetails>();
		 bsd.add(new BikeSearchDetails(1, "MH-14-ER-0954", "Gray", "Bajaj","Pulsar 150", "Theft from Pune Station"));
		 bsd.add(new BikeSearchDetails(1, "MH-45-TH-3456", "White", "Hero","Passion Xpro", "Theft from BudhwarPeth"));
		 bsd.add(new BikeSearchDetails(1, "MH-34-IO-8976", "Blue", "Hero","CD Down", "Theft from Lohgawn"));
		 bsd.add(new BikeSearchDetails(1, "MH-24-JK-8767", "Yellow", "LML","Freedom", "Theft from Corporation"));
		 bsd.add(new BikeSearchDetails(1, "MH-20-CB-2124", "Red", "Hero","Karizma", "Theft from SivajiNagar"));
	        return bsd;
	    }
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
		log.info("First method started");	
        String message = "Hello Spring Boot + JSP";
        
        model.addAttribute("message", message);
 
        return "index.jsp";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
    	log.info("Inside method searchBike");		 
		 List<BikeSearchDetails> bsd=new ArrayList<BikeSearchDetails>();
		 bsd.add(new BikeSearchDetails(1, "MH-14-ER-0954", "Gray", "Bajaj","Pulsar 150", "Theft from Pune Station"));
		 bsd.add(new BikeSearchDetails(1, "MH-45-TH-3456", "White", "Hero","Passion Xpro", "Theft from BudhwarPeth"));
		 bsd.add(new BikeSearchDetails(1, "MH-34-IO-8976", "Blue", "Hero","CD Down", "Theft from Lohgawn"));
		 bsd.add(new BikeSearchDetails(1, "MH-24-JK-8767", "Yellow", "LML","Freedom", "Theft from Corporation"));
		 bsd.add(new BikeSearchDetails(1, "MH-20-CB-2124", "Red", "Hero","Karizma", "Theft from SivajiNagar"));
	       
        model.addAttribute("persons", bsd);
 
        return "bikeSearchList";
    }

}
