package kz.kassayev.indriver.park;

import kz.kassayev.indriver.model.Car;

import java.util.ArrayList;

public class TaxiPark {

    public int allCarsCost(ArrayList<Car> cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }


    public ArrayList<Car> betweenSpeed(ArrayList<Car> cars, int min, int max) {
        ArrayList<Car> carSelection = new ArrayList<>();
        for (Car car : carSelection) {
            if (car.getMaxSpeed()>=min && car.getMaxSpeed()<=max){
                carSelection.add(car);
            }
        }
        return carSelection;
    }


}
