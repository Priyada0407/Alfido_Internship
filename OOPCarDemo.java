// Parent class
class Car {
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display info
    void displayInfo() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }

    // Method to demonstrate polymorphism
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Child class ElectricCar inherits Car
class ElectricCar extends Car {
    int batteryCapacity; // in kWh

    ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // Call parent constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding displayInfo() (without @Override)
    void displayInfo() {
        System.out.println("Electric Car: " + brand + " (" + year + "), Battery: " + batteryCapacity + " kWh");
    }

    // Overriding drive()
    void drive() {
        System.out.println(brand + " is driving silently on electric power \u26A1");
    }
}

// Child class SportsCar inherits Car
class SportsCar extends Car {
    int topSpeed; // in km/h

    SportsCar(String brand, int year, int topSpeed) {
        super(brand, year);
        this.topSpeed = topSpeed;
    }

    // Overriding displayInfo()
    void displayInfo() {
        System.out.println("Sports Car: " + brand + " (" + year + "), Top Speed: " + topSpeed + " km/h");
    }

    // Overriding drive()
    void drive() {
        System.out.println(brand + " is racing at high speed ");
    }
}

// Main class
public class OOPCarDemo {
    public static void main(String[] args) {
        // Parent object
        Car car1 = new Car("Toyota", 2020);

        // Child objects (polymorphism)
        Car tesla = new ElectricCar("Tesla Model S", 2022, 100);
        Car ferrari = new SportsCar("Ferrari F8", 2021, 340);

        // Calling displayInfo() method
        car1.displayInfo();
        tesla.displayInfo();   // Runs ElectricCar's version
        ferrari.displayInfo(); // Runs SportsCar's version

        System.out.println();

        // Calling drive() method
        car1.drive();    // Car version
        tesla.drive();   // ElectricCar version
        ferrari.drive(); // SportsCar version
    }
}
