class Car {
    String make, model;
    int year;

    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.displayDetails();

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2022;
        car2.displayDetails();
    }
}