package com.routes.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiController.class, args);
    }

    @RequestMapping("")
    public String welcome(){
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today(){
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow(){
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @RequestMapping("/travel/{location}")
    public String travel(@PathVariable("location")String location){
        return "Congratulations! You will soon travel to " + location;
    }

    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable("number")int number){
        String comment = "You will take a grand journey in the near future, but be weary of tempting offers.";
        if(number % 2 != 0){
            comment = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
        return comment;
    }
}
