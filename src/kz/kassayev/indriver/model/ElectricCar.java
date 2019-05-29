package kz.kassayev.indriver.model;

/**
 * This class hier class Car
 */
public class ElectricCar extends Car {
    private BatteryType batteryTypes;
    private int chargingTime;
    private int lifeTimeOfBattery;

    public ElectricCar(Mark marks, String model, Type types, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner, BatteryType batteryTypes, int chargingTime, int lifeTimeOfBattery) {
        super(marks, model, types, price, year, milage, maxSpeed, automat, acceleration, numberOfSeats, conditioner);
        this.batteryTypes = batteryTypes;
        this.chargingTime = chargingTime;
        this.lifeTimeOfBattery = lifeTimeOfBattery;
    }

    public BatteryType getBatteryTypes() {
        return batteryTypes;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public int getLifeTimeOfBattery() {
        return lifeTimeOfBattery;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "marks=" + marks +
                ", model='" + model + '\'' +
                ", types=" + types +
                ", price=" + price +
                ", year=" + year +
                ", milage=" + milage +
                ", maxSpeed=" + maxSpeed +
                ", automat=" + automat +
                ", acceleration=" + acceleration +
                ", numberOfSeats=" + numberOfSeats +
                ", conditioner=" + conditioner +
                ", batteryTypes=" + batteryTypes +
                ", chargingTime=" + chargingTime +
                ", lifeTimeOfBattery=" + lifeTimeOfBattery +
                '}';
    }
}
