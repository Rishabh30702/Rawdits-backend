package com.example.Rawdits.Rawdits.Transactions;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Trans_Repository extends MongoRepository<Trans_Entity,Double> {
}
