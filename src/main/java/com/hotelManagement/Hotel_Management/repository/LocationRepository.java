package com.hotelManagement.Hotel_Management.repository;

import com.hotelManagement.Hotel_Management.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
