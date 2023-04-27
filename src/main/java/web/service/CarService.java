package web.service;

import web.model.Car;

import java.util.List;

//переименовал интерфейс
public interface CarService {

    public List<Car> getCar(Integer count);
}
