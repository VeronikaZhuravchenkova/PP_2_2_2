package web.services;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {


    public List<Car> get(int count){
        List<Car> cars = createCars();
        return cars.stream().limit(count).toList();
    }

    private List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada Vesta", 12345, "black"));
        cars.add(new Car("Toyota Camry", 45678, "white"));
        cars.add(new Car("BMW X5", 89253, "red"));
        cars.add(new Car("Volkswagen Polo", 64902, "black"));
        cars.add(new Car("Hyundai Solaris", 182648, "gray"));
        return cars;
    }
}
