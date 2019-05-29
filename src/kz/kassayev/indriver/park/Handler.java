package kz.kassayev.indriver.park;

import kz.kassayev.indriver.model.Car;
import kz.kassayev.indriver.model.ElectricCar;
import kz.kassayev.indriver.model.PetrolCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Handler {

    public List<Car> showAllCars(List<Car> cars) {
        List<Car> selectAll = new ArrayList<>();
        for (Car car : cars) {
            selectAll.add(car);
        }
        return selectAll;
    }

    public int allCarsCost(List<Car> cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    public List<Car> betweenSpeed(List<Car> cars, int min, int max) {
        List<Car> carSelection = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
            }
        }
        return carSelection;
    }

    public List<Car> sortyByFuelEconomy(List<Car> cars) {
        List<PetrolCar> petrolCars = new ArrayList<>();
        List<ElectricCar> electricCars = new ArrayList<>();
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                electricCars.add((ElectricCar) car);
            } else if (car instanceof PetrolCar) {
                petrolCars.add((PetrolCar) car);
            }
        }


        electricCars.sort(Comparator.comparing(ElectricCar::getLifeTimeOfBattery));
        petrolCars.sort(Comparator.comparing(PetrolCar::getFuelConsumption));
        result.addAll(electricCars);
        result.addAll(petrolCars);
        return result;
    }


}
