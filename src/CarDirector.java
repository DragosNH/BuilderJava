public class CarDirector {
    public static Car Peugeot() {
        return new Car.BuilderCar("306").addOptions("gps").addOptions("Camera").build();
    }
}