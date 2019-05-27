package kz.kassayev.indriver.model.bigcars;

import kz.kassayev.indriver.model.FuelType;
import kz.kassayev.indriver.model.Mark;
import kz.kassayev.indriver.model.PetrolCar;
import kz.kassayev.indriver.model.Type;
import kz.kassayev.indriver.service.Passenger;

public class Bus extends PetrolCar implements Passenger {
    private int passengers = 0;

    public Bus(Mark marks, String model, Type types, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelTypes, int fuelTankCapacity, int fuelConsumption, int passengers) {
        super(marks, model, types, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner, fuelTypes, fuelTankCapacity, fuelConsumption);
        this.passengers = passengers;
    }

    @Override
    public int addPassenger() {
        System.out.println("Passenger assigned");
        passengers++;
        return passengers;
    }

    @Override
    public int getPassengerCount() {
        return passengers;
    }
}
