package hu.fm4z3b.java_webalk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/contact").setViewName("contact");
        registry.addViewController("/people_list").setViewName("people_list");
        registry.addViewController("/people_add").setViewName("people_add");

    }
}
