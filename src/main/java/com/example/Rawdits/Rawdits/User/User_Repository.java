package com.example.Rawdits.Rawdits.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repository extends MongoRepository<User_Entity, String> {
}
