package com.tugce.example.h2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    private String roomId;
    private String name;
    private String roomNumber;
    private String bedInfo;
}
