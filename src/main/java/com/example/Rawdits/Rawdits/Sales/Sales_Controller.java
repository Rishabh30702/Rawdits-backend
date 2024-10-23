package com.example.Rawdits.Rawdits.Sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("sales/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class Sales_Controller {

    @Autowired
    private Sales_Repository salesRepository;
    @Autowired
    private Sales_Service salesService;

    @PostMapping("/save")
    private ResponseEntity<?> saveBill(@RequestBody Sales_Entity salesEntity){
        salesRepository.save(salesEntity);
        return new ResponseEntity<>(salesEntity, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    private ResponseEntity<List<Sales_Entity>> getAl(){
        List<Sales_Entity> listAll = salesService.getAllItem();
        return ResponseEntity.ok(listAll);
    }
}
