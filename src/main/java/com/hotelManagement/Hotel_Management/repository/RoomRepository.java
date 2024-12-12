package com.hotelManagement.Hotel_Management.repository;

import com.hotelManagement.Hotel_Management.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {


    @Query("select r from Room r where r.hotel.name =: hotelName")
    public List<Room> findRoomByHotelName(@Param("hotelName") String hotelName);


    @Query("select r from Room r where r.hotel.id =: hotelId")
    public List<Room> findRoomByHotelId(@Param("hotelId") int hotelId);
}
