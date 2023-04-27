package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.UserService;

import java.util.List;

@Controller
public class CarController {

    private UserService userService;

    public CarController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/car")
    public String getCar(Model model, @RequestParam(value = "count", required = false) Integer count){
        List<Car>cars;
        if (count != null) {
            cars = userService.getCar(count);
        } else {
            cars = userService.getAllCar();
        }
        model.addAttribute("car", cars);
        return "car";
    }

}
