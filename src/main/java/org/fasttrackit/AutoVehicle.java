package org.fasttrackit;

//inheritance or "is-a" relationship
public class AutoVehicle extends Vehicle {

    Engine engine;
    boolean running;

    //crearea unui constructor ALT + insert


    public AutoVehicle(Engine engine) {
        this.engine = engine;
        //din acest moment nici un autovehicul nu poate fi fara a avea specificat un motor. fortam programatorii sa foloseasca mandatory fields
    }
}


