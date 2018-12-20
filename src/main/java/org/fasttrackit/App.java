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
       Car car = new Car ();
       car.name = "Dacia";
       car.color = "white";
       car.doorCount = 5;
       car.mileage = 7.5;
       car.running = true;

        /**facem masina (car) sa accelereze
         * stocam distanta intr-o variabila double carTravelDistance
         * car.accelerate - actionam masina cu anumiti parametri
         */
        double carTravelDistance = car.accelerate (100, 2);



       Engine engine = new Engine();
       engine.manufacturer = "Renault";
       engine.capacity = 1500;

       car.engine = engine;

       car.engine.manufacturer = "BMW";
       System.out.println(car.toString());





    }
}
