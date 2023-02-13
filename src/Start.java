public class Start {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {
        Car car = new Car("Fiat",10000);

        car.printCarDetails();
        car.getCarDetails();
    }
}