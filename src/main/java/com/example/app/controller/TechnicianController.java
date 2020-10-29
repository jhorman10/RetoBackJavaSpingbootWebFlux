package com.example.app.controller;

import com.example.app.service.TechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/technicians")
public class TechnicianController {

    @Autowired
    private TechnicianService technicianService;

    @GetMapping
    public ResponseEntity<List<T>> getInfoService(@RequestParam Long dni, @RequestParam Long n) throws Exception{
        List<T> response = technicianService.getHours(dni, n);
        if (response == null || response.isEmpty() || response.get(0) == null) {
            return ResponseEntity.status(HttpStatus.OK).body(new ArrayList<ResponseDTO>());
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
}
