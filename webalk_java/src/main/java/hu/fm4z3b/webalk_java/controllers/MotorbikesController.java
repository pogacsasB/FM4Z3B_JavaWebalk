package hu.fm4z3b.webalk_java.controllers;

import hu.fm4z3b.webalk_java.model.Cars;
import hu.fm4z3b.webalk_java.model.Motorbikes;
import hu.fm4z3b.webalk_java.model.People;
import hu.fm4z3b.webalk_java.repositories.MotorbikesRepository;
import hu.fm4z3b.webalk_java.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MotorbikesController {

    @Autowired
    private MotorbikesRepository bikesRepo;

    @Autowired
    private PeopleRepository peopleRepo;

    @GetMapping("/motorbikes")
    public String listBikes(Model model) {
        List<Motorbikes> bikesList = bikesRepo.findAll();
        model.addAttribute("bikesList", bikesList);

        return "motorbikes";
    }

    @GetMapping("/motorbikes/add")
    public String addBikeForm(Model model) {
        List<People> listPeople = peopleRepo.findAll();

        model.addAttribute("bike", new Motorbikes());
        model.addAttribute("listPeople", listPeople);

        return "motorbikes_add";
    }

    @PostMapping("/motorbikes/save")
    public String saveBike(Motorbikes motorbike) {
        bikesRepo.save(motorbike);

        return "redirect:/motorbikes";
    }

    @GetMapping("motorbikes/edit/{id}")
    public String editBikeForm(@PathVariable("id") int id, Model model) {
        Motorbikes bike = bikesRepo.findById(id).get();
        model.addAttribute("bike", bike);

        List<People> listPeople = peopleRepo.findAll();

        model.addAttribute("listPeople", listPeople);

        return "motorbikes_add";
    }

    @GetMapping("motorbikes/delete/{id}")
    public String deleteBike(@PathVariable("id") int id, Model model) {
        bikesRepo.deleteById(id);

        return "redirect:/motorbikes";
    }

}
