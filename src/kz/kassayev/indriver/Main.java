package kz.kassayev.indriver;

import kz.kassayev.indriver.model.*;
import kz.kassayev.indriver.park.TaxiPark;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        TaxiPark taxi = new TaxiPark();
        cars.add(new ElectricCar(Mark.TESLA,"Model S",Type.SEDAN,82_000,2015,34_000,210,true,300,4,true,BatteryType.ALUMINUM_ION,400,45));
        cars.add(new ElectricCar(Mark.TESLA,"Model 3",Type.SEDAN,44_000,2015,34_000,230,true,300,4,true,BatteryType.ALUMINUM_ION,400,45));


        System.out.println("Amount price of all cars : " + taxi.allCarsCost(cars));

    }
}
