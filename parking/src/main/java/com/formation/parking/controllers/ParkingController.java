package com.formation.parking.controllers;

import com.formation.parking.models.Parking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ParkingController {

    @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
    public List<Parking> getListeParkings() {
        Parking parkingTest = new Parking();
        parkingTest.setNom("Parking de test");
        parkingTest.setNbPlacesTotal(300);
        parkingTest.setNbPlacesDispo(125);
        parkingTest.setStatut("ouvert");
        parkingTest.setHeureMaj("20h35");
        ArrayList<Parking> liste = new ArrayList<>();
        liste.add(parkingTest);
        return liste;
    }
}
