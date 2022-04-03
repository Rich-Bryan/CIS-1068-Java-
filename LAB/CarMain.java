public class CarMain {
    public static void main(String[] args){
        Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8);
        oldJunker.drive(5); // drives the Car 5 miles
        oldJunker.fillTank(1); // put in a gallon of gas
        //System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left
        System.out.println(oldJunker); // prints the attributes of the car to the screen

//        System.out.println();
//        //my new car
//        Car newCar = new Car("Toyota", "Camry", 2022, 20, 1000, 20, 10);
//        newCar.drive(8); // drives the Car 8 miles
//        newCar.fillTank(5); // put in 5 gallon of gas
//        //System.out.println(newCar.getFuelRemaining()); // prints the amount of fuel left
//        System.out.println(newCar); // prints the attributes of the car to the screen

        // array of object
//        Car[] cars = new Car[2];
//
//        Car car1 = new Car("Ford", "Escape", 1992, 15.2, 14, 18, 7);
//        cars[0] = car1;// storing into the array
//
//        Car car2 = new Car("Toyota", "Camry", 2022, 20, 1000, 20, 10);
//        cars[1] = car2;
//
//        System.out.println(cars[0]);
//        System.out.println();
//        System.out.println(cars[1]);






    }
}
