//Muhammad Abdul Hadi ---- Task Completed
//CORE JAVA ---- PITP 2 ---- Car Encapsulation Task(Using methods) and OOP Concepts
//Implementing Encapsulation(by using setters and getters) to use private variables
//Assigned Task ---- 23/10/2025 ---- Thursday  

class Car {
    // Private fields (Encapsulation)
    private int speed;
    private double fuelLevel;
    private boolean engineStatus;

    private static final int MAX_SPEED = 180;

    // Setter Methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setEngineStatus(boolean status) {
        this.engineStatus = status;
    }

    // Methods
    public void startEngine() {
        if (fuelLevel > 0) {
            engineStatus = true;
            System.out.println("Engine started...");
        } else {
            System.out.println("Cannot start engine — no fuel!");
        }
    }

    public void stopEngine() {
        engineStatus = false;
        speed = 0;
        System.out.println("Engine stopped.");
    }

    public void accelerate() {
        if (!engineStatus) {
            System.out.println("Can't accelerate — engine is OFF!");
            return;
        }

        if (fuelLevel <= 0) {
            System.out.println("Out of fuel — please refuel!");
            stopEngine();
            return;
        }

        if (speed < MAX_SPEED) {
            speed += 20;
            fuelLevel -= 2;
            System.out.println("Accelerating... Current speed: " + speed + " km/h");
        } else {
            System.out.println("Maximum speed reached!");
        }
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Refueled " + amount + " litres. Current fuel: " + fuelLevel + " litres.");
        } else {
            System.out.println("Invalid amount — cannot refuel.");
        }
    }

    public void showDashboard() {
        System.out.println("\n \\ - DASHBOARD - /");
        System.out.println("Engine Status : " + (engineStatus ? "ON" : "OFF"));
        System.out.println("Current Speed : " + speed + " km/h");
        System.out.println("Fuel Level    : " + fuelLevel + " litres");
        System.out.println("\n");
    }

    // Getter Methods
    public int getSpeed() {
        return speed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean isEngineOn() {
        return engineStatus;
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj = new Car();      // Default values: speed=0, fuel=0.0, engine=false

        obj.showDashboard();
       
        obj.startEngine();        
        obj.accelerate();        
        obj.refuel(5);
       
        obj.startEngine();        
        obj.accelerate();        
        obj.accelerate();        
        obj.showDashboard();
       
        obj.stopEngine();  
        obj.showDashboard();
    }
}