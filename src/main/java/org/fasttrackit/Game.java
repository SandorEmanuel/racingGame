package org.fasttrackit;

public class Game {

    // crearea unui sir de circuite, trebuie specicat cate circuite dorim. (10)
    private Track[] tracks = new Track[10];

    Vehicle firstCompetitor;
    Vehicle secondCompetitor;

    public void start(){
        addTracks();
        displayAvailableTracks();
    }

    //facem o metoda prin care sa accesam toate track-urile din aplicatie
    private void addTracks(){
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 100);

        tracks[0]= track1;
        tracks[1]= track2;

    }

    private void displayAvailableTracks(){
        System.out.println("Available tracks:");
        System.out.println(tracks[0].getName());
        System.out.println(tracks[1].getName());

    }

}
