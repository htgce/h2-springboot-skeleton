package com.tugce.example.h2.dao;

import com.tugce.example.h2.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository  extends JpaRepository<Room,String> {
    @Override
    List<Room> findAll();
}
