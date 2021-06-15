package com.example.paymentsystem.entity;

import com.example.paymentsystem.entity.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern =  "YYYY-MM-DD HH:mm:SS")
    private Date DTS;

    private String qm;

    private String qid;

    private String op;

    private String param1;

    private Double sum;

    private Status status;

    private String message;

    private String error_message;

    private Long service_id;

    private String phone_number;

    private String FIO;


//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn (name = "service_id", referencedColumnName = "id")
//    private Services services;
}
