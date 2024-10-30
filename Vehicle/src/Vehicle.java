public class Vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;

    public Vehicle(int topSpeed, int currSpeed, String color, String model, String manufacturer, String plateNumber, boolean disabled) {
        this.topSpeed = topSpeed;
        this.currSpeed = currSpeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = disabled;
    }

    //top speed: 350 km/h
    public boolean accelerate() {
        if(currSpeed < topSpeed && disabled == false) {
            currSpeed += 10;
            return true;
        }else{
            System.out.println("You are at your speed limit. Car is shutting down.");
            disabled = true;
            return false;
        }
    }

    public boolean decelerate() {
        if(currSpeed < topSpeed && currSpeed > 0) {
            currSpeed -= 5;
            return true;
        }else{
            System.out.println("Car is off.");
            return false;
        }
    }

    public boolean fix(){
        if(disabled){
            currSpeed = 0;
            disabled = false;
            System.out.println("Vehicle is fixed and is ready go on another journey!");
            return true;
        }else{
            System.out.println("Vehicle doesn't need any fixing");
            return false;

        }
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "topSpeed=" + topSpeed +
                ", currSpeed=" + currSpeed +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", disabled=" + disabled +
                '}';
    }
}
