package com.example.app.service;

import java.util.Date;
import java.util.List;

public interface ServiceService {
    public List<T> calculateHours(Date startDate, Date endDate, Long dni, Long n);
}
