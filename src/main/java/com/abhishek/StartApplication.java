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
        model.addAttribute("msg", "I'm Sidharth Shukla, currently I'm learning DevOps. Today is day 20 of my DevOps learning, and today I learned about MAVEN and how to deploy Java-based applications through Maven. If you'd like to work with me, connect with me.\nList of commands that I used:\n1. sudo apt-get update -y\n2. sudo apt install openjdk-11-jre -y\n3. java -v\n4. java -version\n5. mvn -version\n6. sudo apt-get install maven -y\n7. git clone https://github.com/sidharthhhh/springboot-java-project.git\n8. cd springboot-java-project/\n9. ls\n10. mvn validate\n11. mvn compile\n12. ls\n13. cd target/\n14. ls\n15. cd ..\n16. mvn test\n17. mvn package\n18. cd target/\n19. ls\n20. cd ..\n21. mvn install\n22. ls\n23. mvn clean\n24. ls\n25. mvn clean package\n26. ls\n27. java -jar target/spring-boot-web.jar\n28. history");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
