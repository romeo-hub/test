public class Car {
    String model;
    String type;
    String color;
    String country;

    public Car(String model, String type, String color, String country) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.country = country;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
/*
    void show(String model, String type, String color, String country) {
        System.out.println("Information about " + "model " + model + '\'' + "type " + type + '\''
                + "color" + color + '\'' + "country" + country + '\'');
    }
*/
    public void show2() {
        System.out.println("Information about Car2 " + "\n" +
                "model " + model + "\n" +
                "type " + type + "\n" +
                "color " + color + "\n" +
                "country " + country + "\n");
    }
}
