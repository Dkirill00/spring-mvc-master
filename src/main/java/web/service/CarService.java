package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;


public interface CarService {
    List<Car> getCars(int a, List<Car> cr);
    public List<Car> getCarList();
}
