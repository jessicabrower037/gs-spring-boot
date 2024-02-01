package com.example.springboot;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointParkController {

	@RequestMapping("/point")
    public String point(){
        return "Welcome to the world";
    }
   
    @RequestMapping("/about")
    public String about(){
        return "This is an application made using Java";
    }
    @RequestMapping("/home")
    public String home(){
        return "The Earth is my home";
    }
    @RequestMapping("/date")
    public String date(){
        LocalDate currentDate = LocalDate.now();
        return "The current date is: " + currentDate;
}
}
