package advanced;

public class Car {
    private String vin;

    private String color;

    private int maxSpeed;

    public void printCarDetails() {
        String formatted = String.format("Car vin is %s, car color %s and max speed %d", vin, color, maxSpeed);
        // "Car vin is" + vin + ", car color" + color + " and max speed " + maxSpeed
        System.out.println(formatted);
    }

    public Car(String vin, String color, int maxSpeed) {
        this(vin, color);
        System.out.println("All args constructor");
        this.maxSpeed = maxSpeed;
    }

    public Car(String vin, String color) {
        this();
        System.out.println("Two args constructor");
        this.vin = vin;
        this.color = color;
    }
    public Car() {
        System.out.println("No args constructor");
        this.maxSpeed = 150;
    }

    public void setVin(String vin){
        this.vin = vin;

    }

    public String getVin(){
        return vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
