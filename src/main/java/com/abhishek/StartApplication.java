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
        model.addAttribute("msg", "i m sidharth shukla, currently i m leaning devops. Today is day20 of my devops learning and today i learn about MAVEN and how to deploy Java based application through maven. If you like work then connect with me.
                            list of command that i use are:-   1  sudo apt-get update -y
    2  sudo apt install openjdk-11-jre -y
    3  java -v
    4  java -version
    5  mvn -version
    6  sudo apt-get install maven -y
    7  git clone https://github.com/sidharthhhh/springboot-java-poject.git
    8  cd springboot-java-poject/
    9  ls
   10  mvn validate
   11  mvn compile
   12  ls
   13  cd target/
   14  ls
   15  cd ..
   16  mvn test
   17  mvn package
   18  cd target/
   19  ls
   20  cd ..
   21  mvn install
   22  ls
   23  mvn clear
   24  ls
   25  mvn clean package
   26  ls
   27  java -jar target/spring-boot-web.jar
   28  history
");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
