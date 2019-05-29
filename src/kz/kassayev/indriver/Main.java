package kz.kassayev.indriver;

import kz.kassayev.indriver.model.*;
import kz.kassayev.indriver.model.bigcars.Bus;
import kz.kassayev.indriver.park.Handler;
import kz.kassayev.indriver.report.CarReport;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Handler handler = new Handler();
        CarReport carReport = new CarReport();

        cars.add(new ElectricCar(Mark.TESLA, "Model S", Type.SEDAN, 82_000, 2015, 34_000, 230, true, 5.5, 4, true, BatteryType.ALUMINUM_ION, 400, 350));
        cars.add(new ElectricCar(Mark.TESLA, "Model 3", Type.SEDAN, 44_000, 2015, 75_000, 210, true, 4.8, 4, true, BatteryType.ALUMINUM_ION, 300, 270));
        cars.add(new PetrolCar(Mark.LEXUS, "HS 250", Type.HATCHBACK, 30_000, 2010, 120_000, 180, false, 3.0, 5, true, FuelType.PETROL_AND_GAS, 70, 8));
        cars.add(new PetrolCar(Mark.TOYOTA, "Camry V55", Type.SEDAN, 35_000, 2014, 56_000, 210, true, 4.2, 4, true, FuelType.PETROL, 70, 11));
        cars.add(new PetrolCar(Mark.MERCEDES_BENZ, "E 350d", Type.ESTATE, 67_000, 2011, 80_000, 250, true, 4.3, 4, true, FuelType.DIESEL, 80, 9));

        System.out.println("ALL CARS : ");
        List<Car> allCars = handler.showAllCars(cars);
        carReport.cicleForSout(allCars);

        System.out.println("TOTAL AMOUNT PRICE OF ALL TAXI-CARS : " + handler.allCarsCost(cars) + "$");

        System.out.println("SPEED RANGE SELECTION : ");
        List<Car> carbySpeed = handler.betweenSpeed(cars, 200, 220);
        carReport.cicleForSout(carbySpeed);

        System.out.println("SORT CARS BY ECONOMY (AT FIRST ELECTRIC, THEN PETROL) : ");
        List<Car> carbyEconomy = handler.sortyByFuelEconomy(cars);
        carReport.cicleForSout(carbyEconomy);

        Bus bus = new Bus(Mark.MERCEDES_BENZ,"V 250d", Type.BUS,50_000,2016,23_000,160,true,3.3,10,true,FuelType.DIESEL,90,14,false);
        bus.addPassenger(12);
        System.out.println("PASSANGERS COUNT : " + bus.getPassengerCount());
    }
}
