package com.tugce.example.h2.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoomResponse {
    private String roomId;
    private String name;
    private String roomNumber;
    private String bedInfo;
}
