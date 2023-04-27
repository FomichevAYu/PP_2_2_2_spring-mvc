package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarServiceImpl userService;

    public CarController(CarServiceImpl userService) {
        this.userService = userService;
    }

    //вынес бизнес-логику в CarServiceImpl
    @GetMapping(value = "/car")
    public String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = userService.getCar(count);
        model.addAttribute("car", cars);
        return "car";
    }

}
