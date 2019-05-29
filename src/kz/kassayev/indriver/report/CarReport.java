package kz.kassayev.indriver.report;

import kz.kassayev.indriver.model.Car;

import java.util.List;

public class CarReport {
    public void cicleForSout(List<Car> cars){
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
