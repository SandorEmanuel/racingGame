package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // crearea unui sir de circuite, trebuie specicat cate circuite dorim. (10)
    private Track[] tracks = new Track[10];

    private List<Vehicle> competitors = new ArrayList<>();

    public void start() {
        addCompetitors(3);
        displayCompetitors();
        addTracks();
        displayAvailableTracks();
    }

    private void addCompetitors(int competitorCount){
        for (int i =0; i < competitorCount; i++){
            Vehicle vehicle = new Vehicle();
            // vehicle properties will be populated when we learn get user`s input
            competitors.add(vehicle);
        }
    }
    private void displayCompetitors() {
        System.out.println("Welcome! Today`s competitors are:");
        for(int i = 0; i < competitors.size(); i++) {
            System.out.println(competitors.get(i).getName());
        }
    }

    //facem o metoda prin care sa accesam toate track-urile din aplicatie
    private void addTracks() {
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);

        tracks[0] = track1;
        tracks[1] = track2;

    }

    private void displayAvailableTracks() {
        System.out.println("Available tracks:");

        //classic for loop - se foloseste cand am nevoie sa printez si indexul adica pozitia din sir. sau daca vreau sa rulez actiunea de un anumit numar de ori.
//        for (int i = 0; i < tracks.length; i++) {
//            if (tracks[i] != null) {   //if object is different than null
//                System.out.println(tracks[i].getName());
//            }
//
//        }
        // enhanced for / "for-each"  - nu avem cum sa intram intr-un infinite loop. se foloseste cand vreau sa vad toate proprietatile dintr-o colectie
        for (Track track: tracks){
            if (track != null) {
                System.out.println(track.getName());
            }

        }

    }
}