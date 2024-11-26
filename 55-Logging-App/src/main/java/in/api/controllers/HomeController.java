package in.api.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	private Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/home")
	public String getHome(@RequestParam(defaultValue = "default value",required = false)String value) {
		// not recommended
		//System.out.println("api calling : home");
		
		logger.info("This is info api calling : {}", value);
		logger.debug("This is debug api calling : {}", value);
		logger.error("This is error api calling : {}", value);
		logger.warn("This is warn api calling : {}", value);
		logger.trace("This is trace api calling : {}", value);
		return "This is home api";
	}

}
