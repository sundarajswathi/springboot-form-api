package com.sample.sample;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "formdata")
public class FormDataModel {
    @Id
    private String id;       // MongoDB document ID
    private String name;
    private int age;
    private String address;  // corrected variable name
    private long number;
    private String message;
}

