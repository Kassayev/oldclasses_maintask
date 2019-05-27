package kz.kassayev.indriver.model;

public class PetrolCar extends Car {
    private FuelType fuelTypes;
    private int fuelTankCapacity;
    private int fuelConsumption;

    public PetrolCar(Mark marks, String model, Type types, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, FuelType fuelTypes, int fuelTankCapacity, int fuelConsumption) {
        super(marks, model, types, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner);
        this.fuelTypes = fuelTypes;
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public FuelType getFuelTypes() {
        return fuelTypes;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "fuelTypes=" + fuelTypes +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}