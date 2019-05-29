package kz.kassayev.indriver.model;

/**
 * we make this class abstract so that it is not possible to create its objects
 * variables make protected that heirs could only use
 */
public abstract class Car {
    protected Mark marks;
    protected String model;
    protected Type types;
    protected int price;
    protected int year;
    protected int milage;
    protected int maxSpeed;
    protected boolean automat;
    protected double acceleration;
    protected int numberOfSeats;
    protected boolean conditioner;

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
