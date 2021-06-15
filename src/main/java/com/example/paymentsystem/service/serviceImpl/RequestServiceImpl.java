package com.example.paymentsystem.service.serviceImpl;

import com.example.paymentsystem.dto.RequestDto;
import com.example.paymentsystem.dto.StatusDto;
import com.example.paymentsystem.entity.Request;
import com.example.paymentsystem.entity.enums.Status;
import com.example.paymentsystem.repository.RequestRepository;
import com.example.paymentsystem.service.RequestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RequestServiceImpl implements RequestService {

    private RequestRepository requestRepository;

    @Override
    public StatusDto prePaymentCheck(String param,Long service_id) {
        Request request = requestRepository.findByParam1AndService_id(param,service_id);
        if (request != null){
            return new StatusDto(
                    request.getDTS(),
                    request.getQm(),
                    request.getQid(),
                    request.getOp(),
                    Status.PERSONAL_ACCOUNT_NOT_FOUND.getCode());
        }
        return new StatusDto(
                request.getDTS(),
                request.getQm(),
                request.getQid(),
                request.getOp(),
                Status.PERSONAL_ACCOUNT_NOT_FOUND.getDescription(),
                Status.PERSONAL_ACCOUNT_NOT_FOUND.getCode());
    }

    @Override
    public RequestDto postPaymentCheck(String param, Long service_id) {
        Request request = requestRepository.findByParam1AndService_id(param,service_id);
        if (request != null){
            return new RequestDto(
                    request.getDTS(),
                    request.getQm(),
                    request.getQid(),
                    request.getOp(),
                    Status.VERIFICATION_PASSED_SUCCESSFULLY.getCode(),
                    request.getSum(),
                    request.getPhone_number(),
                    request.getFIO());
        }
        return new RequestDto(
                request.getDTS(),
                request.getQm(),
                request.getQid(),
                request.getOp(),
                Status.PERSONAL_ACCOUNT_NOT_FOUND.getDescription(),
                Status.PERSONAL_ACCOUNT_NOT_FOUND.getCode());
    }
}
