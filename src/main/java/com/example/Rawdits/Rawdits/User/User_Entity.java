package com.example.Rawdits.Rawdits.User;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "Users")
@Data
public class User_Entity {
    @MongoId
    private String Unique_Id;
    private String Username;
    private String Password;
    private String Role;
}
