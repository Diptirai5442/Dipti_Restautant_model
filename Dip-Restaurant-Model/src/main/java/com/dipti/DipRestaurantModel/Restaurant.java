package com.dipti.DipRestaurantModel;

import lombok.Data;

@Data
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String speciality;
    private Integer totalStaff;

    public void setSpecialty(String newSpecialty) {
        return;
    }

    public Object getId() {
        return id;
    }
}
