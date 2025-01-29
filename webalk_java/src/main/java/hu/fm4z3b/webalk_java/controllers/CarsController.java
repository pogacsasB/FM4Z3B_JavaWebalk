package hu.fm4z3b.webalk_java.controllers;

import hu.fm4z3b.webalk_java.model.Cars;
import hu.fm4z3b.webalk_java.model.People;
import hu.fm4z3b.webalk_java.repositories.CarsRepository;
import hu.fm4z3b.webalk_java.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarsRepository carsRepo;

    @Autowired
    private PeopleRepository peopleRepo;

    @GetMapping("/cars")
    public String listCars(Model model) {
        List<Cars> carsList = carsRepo.findAll();
        model.addAttribute("carsList", carsList);

        return "cars";
    }

    @GetMapping("/cars/add")
    public String addCarForm(Model model) {
        List<People> listPeople = peopleRepo.findAll();

        model.addAttribute("car", new Cars());
        model.addAttribute("listPeople", listPeople);

        return "cars_add";
    }

    @PostMapping("/cars/save")
    public String saveCar(Cars car) {
        carsRepo.save(car);

        return "redirect:/cars";
    }

    @GetMapping("cars/edit/{id}")
    public String editCarForm(@PathVariable("id") int id, Model model) {
        Cars car = carsRepo.findById(id).get();
        model.addAttribute("car", car);

        List<People> listPeople = peopleRepo.findAll();

        model.addAttribute("listPeople", listPeople);

        return "cars_add";
    }
}
