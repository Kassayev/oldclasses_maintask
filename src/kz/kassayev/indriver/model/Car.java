package kz.kassayev.indriver.model;

public class Car {
    private Mark marks;
    private String model;
    private Type types;
    private int price;
    private int year;
    private int milage;
    private int maxSpeed;
    private boolean automat;
    private double acceleration;
    private int numberOfSeats;
    private boolean conditioner;

    public Car(Mark marks, String model, Type types, int price, int year, int milage, int maxSpeed, boolean automat, double acceleration, int numberOfSeats, boolean conditioner) {
        this.marks = marks;
        this.model = model;
        this.types = types;
        this.price = price;
        this.year = year;
        this.milage = milage;
        this.maxSpeed = maxSpeed;
        this.automat = automat;
        this.acceleration = acceleration;
        this.numberOfSeats = numberOfSeats;
        this.conditioner = conditioner;
    }

    public Mark getMarks() {
        return marks;
    }

    public String getModel() {
        return model;
    }

    public Type getTypes() {
        return types;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getMilage() {
        return milage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isAutomat() {
        return automat;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    @Override
    public String toString() {
        return "Car{" +
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
                '}';
    }
}
