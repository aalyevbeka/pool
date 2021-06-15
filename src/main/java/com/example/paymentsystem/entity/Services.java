package com.example.paymentsystem.entity;


import lombok.Data;

import javax.persistence.OneToOne;

@Data
public class Services {

    private Long id;

    private String name;

    private String description;


//    @OneToOne(mappedBy = "services")
//    private Request request;
}
