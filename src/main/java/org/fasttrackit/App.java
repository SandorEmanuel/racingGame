package org.fasttrackit;

/**
 * o clasa poate sa extinda o singura clasa
 * orice clasa mosteneste implicit clasa object
 * shift + shift rapid search
 * System.out.println(car.toString())
 */
public class App {
    public static void main(String[] args) {
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//        engine.capacity = 1500;
//
//        Car car = new Car(engine); //contructor "=" se ocupa de crearea obiectului respectiv
//        car.setName("Dacia");
//        car.setColor("White");
//        car.doorCount = 5;
//        car.setMileage(7.5);
//        car.running = true;
//
//        Engine engine1 = new Engine();
//        Car car1 = new Car(engine1);
//
//
//        System.out.println(car.getName());
//
//
//        /**facem masina (car) sa accelereze
//         * stocam distanta intr-o variabila double carTravelDistance
//         * car.accelerate - actionam masina cu anumiti parametri/obiectul car acceseaza metoda accelerate la parametrii definiti
//         */
//        double carTravelDistance = car.accelerate(100, 2);
//
//
//        System.out.println(carTravelDistance);
//
//
//        car.engine.manufacturer = "BMW";
//        System.out.println(car.toString());

        //example of static variables (class) unique for the whole aplicattion
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleCount ++;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount ++;

        Vehicle vehicle3 = new Vehicle();


        System.out.println("Value from vehicle 1: "+vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2: "+vehicle2.vehicleCount);
        System.out.println("Value from Vehicle CLASS: "+Vehicle.vehicleCount);


    }
}
