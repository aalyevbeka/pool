package com.example.paymentsystem.repository;


import com.example.paymentsystem.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
    Request findByParam1AndService_id(String param, Long service_id);
}
