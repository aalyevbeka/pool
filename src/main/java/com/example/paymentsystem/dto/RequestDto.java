package com.example.paymentsystem.dto;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class RequestDto {

    @DateTimeFormat(pattern =  "YYYY-MM-DD HH:mm:SS")
    private Date DTS;

    private String qm;

    private String qid;

    private String op;

    private int code;

    private double sum;

    private String phone_number;

    private String FIO;

    private String description;

    public RequestDto(Date DTS,
                      String qm,
                      String qid,
                      String op,
                      String description,
                      int code) {
        this.DTS = DTS;
        this.qm = qm;
        this.qid = qid;
        this.op = op;
        this.description = description;
        this.code = code;
    }

    public RequestDto(Date DTS,
                      String qm,
                      String qid,
                      String op,
                      int code,
                      double sum,
                      String phone_number,
                      String FIO) {
        this.DTS = DTS;
        this.qm = qm;
        this.qid = qid;
        this.op = op;
        this.code = code;
        this.sum = sum;
        this.phone_number = phone_number;
        this.FIO = FIO;

    }
}
