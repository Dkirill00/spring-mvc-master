package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private List<Car> carList = new ArrayList<>();

    public CarServiceImp() {
        carList.add(new Car("BMW", "X5", 2018));
        carList.add(new Car("Moskvich", "3E", 2023));
        carList.add(new Car("Renault", "Logan", 2010));
        carList.add(new Car("Kia", "Rio", 2015));
        carList.add(new Car("Porsche", "911", 2018));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCars(int a, List<Car> cr) {
        if (a >= cr.size()) {
            return cr;
        } else {
            return cr.subList(0, a);
        }
    }
}
