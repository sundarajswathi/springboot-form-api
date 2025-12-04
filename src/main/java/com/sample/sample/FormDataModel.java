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

//@Data use panina getter/setter work ah handle panum apram toString,Equalsto,hashcode ellamey automatic ah convert panum
//@AllArgsConstructor---->all fields ku constructor create panidum
//@NoArgsConstructor----->all arguments-um illam oru empty constructor automatically create panidum -->json convert pana oru empty constructor venum
//@Document--->mongodb la store agurathu ellamey oru collection than store agum