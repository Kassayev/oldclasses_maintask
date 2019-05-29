package kz.kassayev.indriver.park;

import kz.kassayev.indriver.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Create autopark for taxi cars
 */
public class AutoPark {
    private String name;
    private List<Car> taxipark = new ArrayList<>();

    public AutoPark(String name) {
        this.name = name;
    }

    public void addCar(Car car){
        taxipark.add(car);
    }

    public String getName() {
        return name;
    }

    public List<Car> getTaxipark() {
        return taxipark;
    }
}
