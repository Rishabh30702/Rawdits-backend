package com.example.Rawdits.Rawdits.Sales;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sales_Repository extends MongoRepository<Sales_Entity,String> {
}
