package hu.fm4z3b.webalk_java.controllers;

import hu.fm4z3b.webalk_java.model.Cars;
import hu.fm4z3b.webalk_java.model.People;
import hu.fm4z3b.webalk_java.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepo;

    @GetMapping("/people")
    public String listPeople(Model model) {
        List<People> peopleList = peopleRepo.findAll();
        model.addAttribute("peopleList", peopleList);
        return "people";
    }

    @GetMapping("/people/add")
    public String addPeopleForm(Model model) {
        model.addAttribute("person", new People());

        return "people_add";
    }

    @PostMapping("/people/save")
    public String savePerson(People people) {
        peopleRepo.save(people);
        return "redirect:/people";
    }

    @GetMapping("people/edit/{id}")
    public String editPersonForm(@PathVariable("id") int id, Model model) {
        People person = peopleRepo.findById(id).get();
        model.addAttribute("person", person);

        return "people_add";
    }

    @GetMapping("people/delete/{id}")
    public String deletePerson(@PathVariable("id") int id, Model model) {
        peopleRepo.deleteById(id);

        return "redirect:/people";
    }

}
