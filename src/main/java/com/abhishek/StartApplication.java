package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "This is a SpringBoot Static Web Application");
        model.addAttribute("msg", "i m sidharth shukla, currently i m leaning devops. Today is day20 of my devops learning and today i learn about MAVEN and how to deploy Java based application through maven. If you like work then connect with me.");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
