package web.services;

import web.models.Car;

import java.util.List;

public class ServiceImpl implements Service {


    public List<Car> get(List<Car> cars, int count){
        return cars.stream().limit(count).toList();
    }
}
