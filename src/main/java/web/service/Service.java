package web.service;

import web.model.Car;

import java.util.List;

public interface Service {

    public List<Car> getAllCar();

    public List <Car> getCar(int count);
}
