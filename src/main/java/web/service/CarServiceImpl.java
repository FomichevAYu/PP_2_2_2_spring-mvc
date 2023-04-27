package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//переименовал класс, теперь название из 3 частей
@org.springframework.stereotype.Service
public class CarServiceImpl implements CarService {

    private final List<Car> car = Arrays.asList(
            new Car("model1", 1, "white"),
            new Car("model2", 2, "black"),
            new Car("model3", 3, "yellow"),
            new Car("model4", 4, "green"),
            new Car("model5", 5, "blue")
    );

    @Override
    public List<Car> getCar(Integer count) {
        if (count != null) {
            return car.stream().limit(count).collect(Collectors.toList());
        } else {
            return car;
        }
    }
}
