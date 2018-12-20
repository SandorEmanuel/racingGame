package org.fasttrackit;

/**
 * o clasa poate sa extinda o singura clasa
 *orice clasa mosteneste implicit clasa object
 * shift + shift rapid search
 * System.out.println(car.toString())
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Engine engine = new Engine();

       engine.manufacturer = "Renault";
       engine.capacity = 1500;

       Car car = new Car (engine); //contructor "=" se ocupa de crearea obiectului respectiv
       car.setName("Dacia");
       car.setColor("White");
       car.doorCount = 5;
       car.setMileage(7.5);
       car.running = true;

        System.out.println(car.getName());


        /**facem masina (car) sa accelereze
         * stocam distanta intr-o variabila double carTravelDistance
         * car.accelerate - actionam masina cu anumiti parametri/obiectul car acceseaza metoda accelerate la parametrii definiti
         */
       double carTravelDistance = car.accelerate (100, 2);


       car.engine = engine;

       car.engine.manufacturer = "BMW";
       System.out.println(car.toString());


    }
}
