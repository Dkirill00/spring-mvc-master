package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(name = "count", required = false) Integer count, ModelMap mode){
        if(count != null){
            mode.addAttribute("carList", carService.getCars(count, carService.getCarList()));
        }else {
            mode.addAttribute("carList", carService.getCarList());
        }
        return "cars";
    }
}
// https://springhow.com/thymeleaf-lists/