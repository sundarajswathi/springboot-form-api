package com.sample.sample;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
    
@Repository
public interface FormRepository extends MongoRepository<FormDataModel, String>{
    
}
//spring data la interface use pana automatic implement panidum illana namba than create pananum athey mathiri class use panalum apadi than.
//DB la data send pana
//DB la  irunthu data va retrieve pana
//records save,delete,update pana
// queries run pana

// why to use interface becasue spring data ---->runtime la implementation auto generate panum,so namaku time save code clean
//formrespostiory extends mongorepository ----->mongo repository la already save(),findbyid(),deletebyid(),findbyall(),existsbyid() entha methods lam iruku athu formrepository la use panikalam

//<formdatamodel,string>----->repository ena panum na entha file ah namba db la store pananum apram athodo id ena type la irukunu declare panurom
//FormDataModel=entity/document class type

//1.repository ena class oda data va DB-la store pana poram nu spring ku solanum
//...............>mongorepository<formdatamodel,string> ithu spring ku solurathu "namma db la store pana pora document/class=FormDataModel"

//2.string=ID field type
// namba class-la use pana @Id variable ena type nu solanum ---->so repository la second generic parameter string nu podanum
//...................conclusion.............
// first type---->class name(document/entity)
//second type---->ID datatype etha generic parameter nu soluvanga