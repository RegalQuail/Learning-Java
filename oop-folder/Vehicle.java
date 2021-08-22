public class Vehicle {

    int maxSpeed;
    int wheels;
    String colour;
    Double fuelCapacity;

    void horn() {
        System.out.println("Beep !");
    }

    private String color;

    // The getter method returns the value of the attribute
    public String getColor() {
        return color;
    }

    // The setter method takes a parameter and assigns it to the attribute
    public void setColor(String c) {
        this.color = c;
    }

    Vehicle() {
        this.setColor("Red");
    }

    Vehicle(String c) {
        this.setColor(c);
    }

}