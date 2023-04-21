package com.example.Dto;

import lombok.Data;

@Data
public class UserLocationDTO {

    private long userID;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
