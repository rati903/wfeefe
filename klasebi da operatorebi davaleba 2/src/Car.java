public class Car {
     String make;
     String model;
     int year;
     String vehicleStateNumber;


    public Car(String make, String model, int year, String vehicleStateNumber) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleStateNumber = vehicleStateNumber;
    }


    public void printInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("Vehicle State Number: " + vehicleStateNumber);
        System.out.println();
    }
}
