public class Car {
    String make, model;
    int year;
    double MPG, milesDriven, fuelCapacity, fuelRemaining;

    //constructor
    public Car(String make, String model, int year, double MPG, double milesDriven, double fuelCapacity, double fuelRemaining){
        this.make = make;
        this.model = model;
        this.year = year;
        this.MPG = MPG;
        this.milesDriven = milesDriven;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemaining = fuelRemaining;
    }
    public void fillTank(double g){
        // check for more than the capacity
        if((fuelRemaining + g) > fuelCapacity){
            System.out.println("not enough capacity");
        }// we add to it
        else{
            fuelRemaining += g;
        }

    }

    public void drive(double m){
        double fuel = m/MPG;
        //
        if(fuel > fuelRemaining){
            System.out.println("not enough fuel");
        }else{
            milesDriven += m; // adding to the mileDriven
            fuelRemaining = fuelRemaining - fuel; // subtracting to the fuel Remaining
        }
    }

    public String toString(){
        return "Car make: " + make +
                "\nmodel: " + model +
                "\nyear: " + year +
                "\nMPG: " + MPG +
                "\nmilesDriven: " + milesDriven +
                "\nfuel Capacity: " + fuelCapacity +
                "\nfuel Remaining: " + fuelRemaining;

    }

    public double getFuelRemaining(){
        return fuelRemaining;
    }

}
