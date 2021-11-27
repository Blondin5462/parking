package com.formation.parking.controllers;

import com.formation.parking.models.Parking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

    @RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
    public List<Parking> getListeParkings() {
        return null;
    }
}
