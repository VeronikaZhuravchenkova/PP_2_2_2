package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.ServiceImpl;


@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String printListOfCars(ModelMap model,
                                  @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("message", new ServiceImpl().get(count));
        return "cars.html";
    }
}
