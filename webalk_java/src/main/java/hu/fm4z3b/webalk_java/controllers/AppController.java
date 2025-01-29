package hu.fm4z3b.webalk_java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    //spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect

    @GetMapping("")
    public String HomePage() {
        return "index";
    }
}
