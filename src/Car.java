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
        return  "----------------------------" + "\n" + "Le model est: " + model + "\n" +"La couleur est: " + color + "\n" + "Extra options: " + extraOptions + "\n" + "----------------------------";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
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
    }



}