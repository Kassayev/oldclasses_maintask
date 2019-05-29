package kz.kassayev.indriver.report;

import kz.kassayev.indriver.model.Car;

import java.util.List;

public class CarReport {
    /**
     * this method is not to write the loop again
     *
     * @param cars
     */
    public void cicleForSout(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
