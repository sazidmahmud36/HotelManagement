package com.hotelManagement.Hotel_Management.restcontroller;

import com.hotelManagement.Hotel_Management.entity.Hotel;
import com.hotelManagement.Hotel_Management.entity.Location;
import com.hotelManagement.Hotel_Management.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;


}
