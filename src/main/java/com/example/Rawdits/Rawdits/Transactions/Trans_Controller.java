package com.example.Rawdits.Rawdits.Transactions;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("trans/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class Trans_Controller {
    @Autowired
    private Trans_Service transService;

    @Autowired
    private Trans_Repository transRepository;
    @PostMapping("/save")
    private ResponseEntity<?> saveTransactions(@RequestBody Trans_Entity transEntity){
        transRepository.save(transEntity);
        return new ResponseEntity<>(transEntity, HttpStatus.OK);
    }
    @GetMapping("/getAll")
    private ResponseEntity<List<Trans_Entity>> getAll(){
        List<Trans_Entity> entities = transService.getAllItems();
        return ResponseEntity.ok(entities);
    }
}
