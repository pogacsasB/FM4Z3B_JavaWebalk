package hu.fm4z3b.java_webalk.controllers;

import hu.fm4z3b.java_webalk.models.People;
import hu.fm4z3b.java_webalk.models.PeopleDTO;
import hu.fm4z3b.java_webalk.services.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;

import jakarta.validation.*;

import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleRepository repository;

    @GetMapping({"","/"})
    public String listPeople(Model model) {
        List<People> people = repository.findAll();
        model.addAttribute("people", people);
        return "people_list";
    }

    @GetMapping("/people_add")
    public String AddPeople(Model model) {
        PeopleDTO peopleDto = new PeopleDTO();
        model.addAttribute("peopleDto", peopleDto);
        return "people_add";
    }

    @PostMapping("/people_add")
    public String createProduct(
            @Valid @ModelAttribute PeopleDTO peopleDto,
            BindingResult result) {



        return "redirect:/people";
    }
}
