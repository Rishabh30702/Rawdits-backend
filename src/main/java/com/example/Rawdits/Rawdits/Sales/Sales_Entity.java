package com.example.Rawdits.Rawdits.Sales;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "Sales")
public class Sales_Entity {
    @MongoId
    private String bill_No;
    private String item_Name;
    private String bill_date;
    private String item_Desc;
    private Double amount;
}
