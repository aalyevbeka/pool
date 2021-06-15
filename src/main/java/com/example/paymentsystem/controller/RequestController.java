package com.example.paymentsystem.controller;


import com.example.paymentsystem.dto.RequestDto;
import com.example.paymentsystem.service.RequestService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@AllArgsConstructor
public class RequestController {

    private RequestService requestService;

    @GetMapping(value = "/check", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity check (@RequestPart String param,
                                 @RequestPart Long service_id){
        requestService.prePaymentCheck(param,service_id);
        return new ResponseEntity("", HttpStatus.OK);
    }
}
