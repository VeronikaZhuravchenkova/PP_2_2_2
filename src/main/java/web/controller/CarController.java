package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.Service;
import web.services.ServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String printListOfCars(ModelMap model,
                                  @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada Vesta", 12345, "black"));
        cars.add(new Car("Toyota Camry", 45678, "white"));
        cars.add(new Car("BMW X5", 89253, "red"));
        cars.add(new Car("Volkswagen Polo", 64902, "black"));
        cars.add(new Car("Hyundai Solaris", 182648, "gray"));
        Service service = new ServiceImpl();
        model.addAttribute("message", service.get(cars, count));
        return "cars.html";

    }
}
