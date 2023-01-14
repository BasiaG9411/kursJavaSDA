package advanced;

public class CarPlayground {
    public static void main(String[] args) {
        Car car = new Car( "WERWE1234323","White", 185 );

        car.printCarDetails();

        System.out.println(car);

        Car car1 = new Car("Asdf12342134", "Golden");
        System.out.println(car1);
    }
}
