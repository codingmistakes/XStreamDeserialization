package com.example.demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Weather;
import com.example.demo.utility.WeatherFetcher;
import com.thoughtworks.xstream.XStream;

@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String Fetch(Model model) {

    	String weatherDataStr = "";
    	
    	try {
    		// read weather data from 3rd party as XML
    		weatherDataStr = WeatherFetcher.Get();
    	}
    	catch(MalformedURLException mue)
    	{
    		model.addAttribute("errorMsg", "Failed to fetch service data");
    		return "error";
    	}
    	catch(IOException ioe)
    	{
    		model.addAttribute("errorMsg", "Failed to fetch service data");
    		return "error";
    	} 

    	   	
    	XStream xstream = new XStream(); 
    	List<Weather> weatherdata = (List<Weather>) xstream.fromXML(weatherDataStr);
    	
		model.addAttribute("weatherdata", weatherdata);
		
		
        return "index";
    }  
    
    @RequestMapping(value="/error", method = RequestMethod.GET)
    public String Error(Model model)
    {
		model.addAttribute("errorMsg", "An internal failure");
    	return "error";
    }

}
