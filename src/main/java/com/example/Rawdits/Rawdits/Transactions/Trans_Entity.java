package com.example.Rawdits.Rawdits.Transactions;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "Transactions")
public class Trans_Entity {
    @MongoId
    private Double trans_id;
    private String trans_date;
    private String trans_desc;
    private Double trans_amount;
    private String trans_type;
}
