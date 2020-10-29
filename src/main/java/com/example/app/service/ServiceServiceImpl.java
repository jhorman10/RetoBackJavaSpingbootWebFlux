package com.example.app.service;

import com.example.app.business.CalculateHours;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.List;

@Service
public class ServiceServiceImpl {
    public CalculateHours calculateHours;

    public static Mono<T> calculateHours(Date startDate, Date endDate, Long dni, Long n) throws  Exception{
        List<T> resp = null;
        return (Mono<T>) resp;
    }
}
