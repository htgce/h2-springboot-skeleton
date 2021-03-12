package com.tugce.example.h2.controller;

import com.tugce.example.h2.dto.RoomResponse;
import com.tugce.example.h2.service.RoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    public ResponseEntity<List<RoomResponse>> getRooms() {
        List<RoomResponse> rooms = roomService.getAllRooms();
        if (CollectionUtils.isEmpty(rooms)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(rooms);
        }
    }

}
