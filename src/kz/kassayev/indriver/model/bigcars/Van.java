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
    private int passengerCount;

    public Van(Mark marks, String model, Type types, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelTypes, int fuelTankCapacity, int fuelConsumption, short freightId, int passengers, double freightWeight) {
        super(marks, model, types, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner, fuelTypes, fuelTankCapacity, fuelConsumption);
        this.freightId = freightId;
        this.passengers = passengers;
        this.freightWeight = freightWeight;
    }

    @Override
    public void addPassenger(int passengers) {
        if (passengers > numberOfSeats){
            int otherPassengers;
            otherPassengers = passengers - numberOfSeats;
            System.out.println("OTHER " + otherPassengers + " PASSANGERS WILL WALL, BECAUSE " + numberOfSeats + " SEATS.");
            passengerCount = numberOfSeats;
        } else {
            System.out.println("PASSANGERS ASSIGNED.");
            passengerCount = passengers;
        }
    }

    @Override
    public int getPassengerCount() {
        return passengerCount;
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
