public class CarDirector {
    public static Car Peugeot() {
        return new Car.BuilderCar("306").addOptions("gps").build();
    }
}
