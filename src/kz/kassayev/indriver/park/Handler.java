package kz.kassayev.indriver.park;

import kz.kassayev.indriver.model.Car;
import kz.kassayev.indriver.model.ElectricCar;
import kz.kassayev.indriver.model.PetrolCar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Handler {

    /**
     * This class can show all taxi cars for user
     *
     * @param cars
     * @return list of cars
     */
    public List<Car> showAllCars(List<Car> cars) {
        List<Car> selectAll = new ArrayList<>();
        for (Car car : cars) {
            selectAll.add(car);
        }
        return selectAll;
    }

    /**
     * This class calculate price of cars in taxi park
     *
     * @param cars
     * @return total amount price
     */
    public int allCarsCost(List<Car> cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    /**
     * User set parametrs
     *
     * @param cars
     * @param min
     * @param max
     * @return get list of cars, which this speed range
     */
    public List<Car> showBySpeedRange(List<Car> cars, int min, int max) {
        List<Car> carSelection = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= min && car.getMaxSpeed() <= max) {
                carSelection.add(car);
            }
        }
        return carSelection;
    }

    /**
     * At first determines class instance, then assign.
     * then sorts separately, because electric car it has different results
     *
     * @param cars
     * @return get sorted list
     */
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
