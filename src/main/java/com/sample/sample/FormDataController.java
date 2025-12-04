package com.sample.sample;

 import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/formdata")
public class FormDataController {
    @Autowired
    private FormRepository form;
    
    @PostMapping
    public FormDataModel SubmitFormDataModel(@RequestBody FormDataModel Data){//requestbody la than json format data va varum atha entha class ku kudukanum namba than decide pananum athunal than anga formdatamodel nu kudutu irukom athuku peruthan mapped object nu soluvom---->antha map an object ah data nu oru varialbe name store panunganu solurom antha name vachithan namba db la save panamudiyum.
        return form.save(Data);

    }
    @GetMapping
    public List<FormDataModel> getAllForms(){//multiple values store pani irukum db la athunala than namba
        //list use panurom ethu multiple values return pani orey method name la namku send  panum getallforms()--->ethu method name
        //method name illama method declare pana mudiyathu apram complie time error varum 
        return form.findAll();
    }
    @GetMapping("/{id}")
    public Optional<FormDataModel>getFormDataById(@PathVariable String id){
        return form.findById(id);
    }
   @PutMapping("/{id}")
public FormDataModel updateSingleField(@PathVariable String id, @RequestBody FormDataModel updateData){
    return form.findById(id).map(existingData ->{
        if(updateData.getName()!=null){
            existingData.setName(updateData.getName());
        }
         if(updateData.getAge()!=0){
            existingData.setAge(updateData.getAge());
        }
         if(updateData.getAddress()!=null){
            existingData.setAddress(updateData.getAddress());
        }
         if(updateData.getNumber () !=0){
            existingData.setNumber(updateData.getNumber());
        }
         if(updateData.getMessage()!=null){
            existingData.setMessage(updateData.getMessage());
        }
        return form.save(existingData);
    })
    .orElseThrow(()->new RuntimeException("Data not found with id:"+id));
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteFormData(@PathVariable String id){
    form.deleteById(id);
    return ResponseEntity.ok("form data successfully delete with ID: "+ id);
}
// @DeleteMapping
// public String deleteAllForms(){
//     form.deleteAll();
//     return("delete all");
// }
@DeleteMapping
public ResponseEntity<String> deleteFormAllData(){
    form.deleteAll();
    return ResponseEntity.ok("delete all");
}
}
     
    

