package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;

    private String name; // private - vreau sa ma folosesc de variabile doar in aceasta clasa
    private String color;
    private double mileage;
    private double fuelLevel;
    private double totalTravelDistance;



    public Vehicle() {
        vehicleCount++;
    }

    //vrem ca orice vehicul sa accelereze
    //void nu intoarce nimic
    //double - o sa intoarca un numar cu zecimale
    //denumirea metodelor se face folosind un verb - metoda este o actiune(comportament)
    //()metoda noastra nu are nevoie de nici o informatie adica pur si simplu actioneaza
    //ctrl+alt+L
    // CTRL + SHIFT + V - acces la clipboard, daca am folosit cut la mai multe linii
    // CTRL + Click pe o metoda - ne duce la locul unde a fost declarata.

    //Declararea unei metode!!!!

    public double accelerate(double speed, double durationInHours) {                                         //semnatura metodei
        //Apelarea unei metode
        System.out.println(name + " accelerated with " + speed + " km/h for " + durationInHours + " hours. "); // concatenare - lipirea mai multor stringuri
        double traveledDistance = speed * durationInHours;                                                  // definirea formulei de calcul

        System.out.println("Travel distance: " + traveledDistance + " km.");// afisarea distantei parcurse
        totalTravelDistance += traveledDistance; //acelasi lucru ca si totalTravelDistance = totalTravelDistance + traveledDistance;
        System.out.println("Total traveled distance: " + totalTravelDistance);

        double spentFuel = traveledDistance * mileage/100;

        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " +fuelLevel);

        return traveledDistance;                                                                           //trebuie sa fie ultima instructiune din metoda

    }

        public double accelerate(double speed){
        return accelerate(speed, 1);
    }


    protected Vehicle clone(){
        Vehicle vehicle=new Vehicle();
        //copy properties form current object or simply call this.clone()
            return vehicle;
        }


    //getter and setter citim si modificam ALT + Insert (0 cu num lock inactiv)


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim(); // .trim() - va sterge din toate denumirile din proiect spatiile.
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalTravelDistance() {
        return totalTravelDistance;
    }

    public void setTotalTravelDistance(double totalTravelDistance) {
        this.totalTravelDistance = totalTravelDistance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
