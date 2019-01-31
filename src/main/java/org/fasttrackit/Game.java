package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    // crearea unui sir de circuite, trebuie specicat cate circuite dorim. (10)
    private Track[] tracks = new Track[10];

    private List<Vehicle> competitors = new ArrayList<>();

    public void start() throws Exception {
        addCompetitors(getCompetitorCountFromUser());
        displayCompetitors();
        addTracks();
        displayAvailableTracks();

        int numberFromUser = getTrackSelectionFromUser();
        Track track = tracks[numberFromUser - 1];
        System.out.println("Selected track: " + track.getName());

        boolean noWinnerYet = true;
        int competitorsWithoutFuel = 0;

        while(noWinnerYet && competitorsWithoutFuel < competitors.size()) {

            for (Vehicle vehicle : competitors) {
                double speed = getAccelerationSpeedFromUser();
                vehicle.accelerate(speed);

                if (vehicle.getFuelLevel() <= 0){
                    competitorsWithoutFuel ++;
                }

                if(vehicle.getTotalTravelDistance() >= track.getLength()){
                    System.out.println("Congrats! The winner is "+ vehicle.getName());
                    noWinnerYet = false;
                    break;
                }
            }
        }

    }

    private void addCompetitors(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser()); // setam metoda definita mai devreme getVehicleNameFromUser sa seteze numele vehicle.
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5, 25)); // setam pentru masina noastra un consum aleatoriu din intervalul [5-25]
            System.out.println("Vehicle milage is :" + vehicle.getMileage()); // afisarea consumului setat aleatoriu mai sus pentru vehiculul creat

            competitors.add(vehicle);
        }
    }

    // facem o metoda prin care preluam de la user numarul de competitori. ulterior utilizam metoda ca si parametru pentru metoda addCompetitors din metoda start()
    private String getVehicleNameFromUser() {
        System.out.println("Please enter a vehicle name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehicle name is: " + name);
        return name;
    }

    private int getTrackSelectionFromUser() {
        System.out.println("Please select a track: 1 or 2");
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfTrack = scanner.nextInt();
            return numberOfTrack;
        } catch (InputMismatchException exception) {
            System.out.println("Try again");

            return getTrackSelectionFromUser();
        }

//        private String getTrackSelectionFromUser () {
//            System.out.println("Please select a track name: ");
//            Scanner scanner = new Scanner(System.in);
//            try {
//                String numberOfTrack = String.valueOf(scanner.nextInt());
//                return numberOfTrack;
//
//            } catch (InputMismatchException exception) {
//                System.out.println("Try again");
//
//                return getTrackSelectionFromUser();
//            }


        }

        private int getCompetitorCountFromUser () throws Exception {
            System.out.println("Please enter number of players:");
            Scanner scanner = new Scanner(System.in);

            // incercam sa evitam ca utilizatorul sa puna un alt tip de input, altul decat Integer (int) prin afisarea unui mesaj mai reprezentativ
            try {
                int numberOfPlayers = scanner.nextInt();
                System.out.println("Selected number of players: " + numberOfPlayers);
                return numberOfPlayers;
            } catch (InputMismatchException exception) {
                //throw  new Exception("Integer required."); // select Exception si ALT+Enter + Add exception to method signature
                System.out.println("Please enter a valid integer.");
                return getCompetitorCountFromUser(); // recursivitate - metoda se reporneste
            }

        }

        private void displayCompetitors () {
            System.out.println("Welcome! Today`s competitors are:");
            for (int i = 0; i < competitors.size(); i++) {
                System.out.println(competitors.get(i).getName());
            }
        }

        //facem o metoda prin care sa accesam toate track-urile din aplicatie
        private void addTracks () {
            Track track1 = new Track("Highway", 300);
            Track track2 = new Track("Seaside", 100);

            tracks[0] = track1;
            tracks[1] = track2;
        }

        private void displayAvailableTracks () {
            System.out.println("Available tracks:");

            //classic for loop - se foloseste cand am nevoie sa printez si indexul adica pozitia din sir. sau daca vreau sa rulez actiunea de un anumit numar de ori.
//        for (int i = 0; i < tracks.length; i++) {
//            if (tracks[i] != null) {   //if object is different than null
//                System.out.println(tracks[i].getName());
//            }
//
//        }
            // enhanced for / "for-each"  - nu avem cum sa intram intr-un infinite loop. se foloseste cand vreau sa vad toate proprietatile dintr-o colectie
            for (Track track : tracks) {
                if (track != null) {
                    System.out.println(track.getName());
                }

            }

        }
        private double getAccelerationSpeedFromUser(){
            System.out.println("Please enter acceleration speed:");
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextDouble();
            }catch (InputMismatchException e){
                System.out.println("Please enter a valid decimal number.");
                return getAccelerationSpeedFromUser();
            }
        }
    }