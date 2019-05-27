package kz.kassayev.indriver.model.bigcars;

import kz.kassayev.indriver.model.FuelType;
import kz.kassayev.indriver.model.Mark;
import kz.kassayev.indriver.model.PetrolCar;
import kz.kassayev.indriver.model.Type;
import kz.kassayev.indriver.service.Passenger;
import kz.kassayev.indriver.service.Freight;

public class Van extends PetrolCar implements Passenger, Freight {
    private short freightId = 0;
    private int passengers = 0;
    private double freightWeight = 0;

    public Van(Mark marks, String model, Type types, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelTypes, int fuelTankCapacity, int fuelConsumption, short freightId, int passengers, double freightWeight) {
        super(marks, model, types, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner, fuelTypes, fuelTankCapacity, fuelConsumption);
        this.freightId = freightId;
        this.passengers = passengers;
        this.freightWeight = freightWeight;
    }

    @Override
    public int addPassenger() {
        passengers++;
        return passengers;
    }

    @Override
    public int getPassengerCount() {
        return passengers;
    }

    @Override
    public short getFreightId() {
        if (freightId == 0) {
            System.out.println("There is no load in the car");
        }
        return freightId;
    }

    @Override
    public double getFreightWeight() {
        if (freightWeight == 0){
            System.out.println("There is no load in the car");
        }
        return freightWeight;
    }
}