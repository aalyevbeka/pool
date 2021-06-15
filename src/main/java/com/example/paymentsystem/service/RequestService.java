package com.example.paymentsystem.service;

import com.example.paymentsystem.dto.RequestDto;
import com.example.paymentsystem.dto.StatusDto;

public interface RequestService {
    StatusDto prePaymentCheck(String param,Long service_id);
    RequestDto postPaymentCheck(String param,Long service_id);

}
