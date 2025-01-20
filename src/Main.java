public class Main {
    public static void main(String[] args) {

        Car Peugeot = CarDirector.Peugeot();
        Peugeot.setModel("3007");
        Peugeot.setColor("rouge");

        Car Peugeot2 = CarDirector.Peugeot();
        Peugeot2.setModel("206");
        Peugeot2.setColor("bleue");

        System.out.println(Peugeot.toString());
        System.out.println(Peugeot2.toString());

    }
}