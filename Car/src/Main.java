public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMV");
        car1.setType("Sedan");
        car1.setColor("White");
        car1.setCountry("Belarus");
        Car car2 = new Car("Audi", "Sedan", "Green", "Russia");
        System.out.println("Information about Car1 " + "\n" + "model " + car1.getModel() + "\n"
                + "type " + car1.getType()+ "\n" + "color " + car1.getColor() + "\n"
                + "country " + car1.getCountry() + "\n");
        car1.show();
        System.out.println(car1);
    }
}