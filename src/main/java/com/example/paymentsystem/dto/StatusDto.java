package com.example.paymentsystem.dto;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class StatusDto {

    @DateTimeFormat(pattern =  "YYYY-MM-DD HH:mm:SS")
    private Date DTS;

    private String qm;

    private String qid;

    private String op;

    private String description;
    private int code;

    public StatusDto(Date DTS,
                     String qm,
                     String qid,
                     String op,
                     int code) {
        this.DTS = DTS;
        this.qm = qm;
        this.qid = qid;
        this.op = op;
        this.code = code;
    }

    public StatusDto(Date DTS,
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
}
