import java.util.ArrayList;

public class Car {
    private String model = "";
    private String color = "";
    private ArrayList<String> extraOptions = new ArrayList<String>();

    private Car(BuilderCar builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.extraOptions = builder.extraOptions;
    }

    public String toString() {
        return "Le model est: " + model + " la couleur est: " + color + " extra options: " + extraOptions;
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
            return new Car(this);
        }

        public String getModel() {
            return model;
        }
        public String getColor() {
            return color;
        }
        public String setColor(String color) {
            this.color = color;
            return color;
        }
    }



}