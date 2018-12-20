package org.fasttrackit;

public class Vehicle {
    String name;
    String color;
    double mileage;

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

        System.out.println("Travel distance: " + traveledDistance + " km.");                                         // afisarea distantei parcurse
        return traveledDistance;                                                                           //trebuie sa fie ultima instructiune din metoda

    }
}
