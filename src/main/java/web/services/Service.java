package web.services;

import web.models.Car;

import java.util.List;

public interface Service {
    public List<Car> get(int count);
}
