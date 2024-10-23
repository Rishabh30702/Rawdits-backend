package com.example.Rawdits.Rawdits.Sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sales_Service {
    @Autowired
    private Sales_Repository salesRepository;
    public List<Sales_Entity> getAllItem() {
        return salesRepository.findAll();
    }
}
