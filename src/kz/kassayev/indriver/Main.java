package kz.kassayev.indriver;

import kz.kassayev.indriver.model.*;
import kz.kassayev.indriver.park.TaxiPark;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        TaxiPark taxi = new TaxiPark();

        cars.add(new ElectricCar(Mark.TESLA, "Model S", Type.SEDAN, 82_000, 2015, 34_000, 210, true, 5.5, 4, true, BatteryType.ALUMINUM_ION, 400, 350));
        cars.add(new ElectricCar(Mark.TESLA, "Model 3", Type.SEDAN, 44_000, 2015, 75_000, 230, true, 4.8, 4, true, BatteryType.ALUMINUM_ION, 300, 270));
        cars.add(new PetrolCar(Mark.LEXUS, "HS 250", Type.HATCHBACK, 30_000, 2010, 120_000, 180, false, 3.0, 5, true, FuelType.PETROL_AND_GAS, 70, 8));

        System.out.println("ALL CARS : ");
        List<Car> allCars = taxi.showAllCars(cars);
        for (Car car : allCars) {
            System.out.println(car);
        }

        System.out.println("Total amount price of all cars : " + taxi.allCarsCost(cars));

        System.out.println("Speed range selection : ");
        List<Car> carbySpeed = taxi.betweenSpeed(cars, 200, 220);
        for (Car car : carbySpeed) {
            System.out.println(car);
        }

        System.out.println("Sort cars by economy : (At first electric cars, then petrol");
        List<Car> carbyEconomy = taxi.sortyByFuelEconomy(cars);
        for (Car car:carbyEconomy) {
            System.out.println(car);
        }


    }
}
