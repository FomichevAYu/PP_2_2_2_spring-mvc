package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class UserService implements Service {

    private static final List <Car> car = Arrays.asList(
            new Car("model1", 1, "white"),
            new Car("model2", 2, "black"),
            new Car("model3", 3, "yellow"),
            new Car("model4", 4, "green"),
            new Car("model5", 5, "blue")
            );
    @Override
    public List<Car> getAllCar() {
        return car;
    }

    @Override
    public List<Car> getCar(int count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }
}
