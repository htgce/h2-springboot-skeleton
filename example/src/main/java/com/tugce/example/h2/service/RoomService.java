package com.tugce.example.h2.service;

import com.tugce.example.h2.dao.RoomRepository;
import com.tugce.example.h2.dto.RoomResponse;
import com.tugce.example.h2.model.Room;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<RoomResponse> getAllRooms(){
        List<Room> allRooms = roomRepository.findAll();
        if(CollectionUtils.isEmpty(allRooms)){
            return List.of();
        }else{
           return allRooms.stream()
                    .map(item-> RoomResponse.builder().bedInfo(item.getBedInfo()).roomId(item.getRoomId()).roomNumber(item.getRoomNumber()).name(item.getName()).build()).collect(Collectors.toList());
        }
    }
}
