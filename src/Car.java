import java.util.ArrayList;

public class Car {
    private String model = "";
    private String color = "";
    private ArrayList<String> extraOptions = new ArrayList<String>();

    public String toString() {
        return model + " " + color + " " + extraOptions;
    }

    public static class BuilderCar {
        private String model = "";
        private String color = "";
        private ArrayList<String> extraOptions = new ArrayList<String>();

        public BuilderCar(String model){
            this.model = model;
        }

        public BuilderCar addOptions(String item){
            this.extraOptions.add(item);
            return this;
        }

        public BuilderCar addExtraOptions(String item){
            this.extraOptions.add(item);
            return this;
        }

        public Car build(){
            return new Car();
        }
    }



}
