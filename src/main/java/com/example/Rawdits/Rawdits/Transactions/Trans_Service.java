package com.example.Rawdits.Rawdits.Transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Trans_Service {
    @Autowired
    private Trans_Repository transRepository;
    public List<Trans_Entity> getAllItems() {
        return transRepository.findAll();
    }
}
