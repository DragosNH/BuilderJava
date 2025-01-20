public abstract class IBuilderCar {
    public Car.BuilderCar builderCar;

    public abstract Car.BuilderCar addOptions(String item);

    public abstract Car build();
}