package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import com.csi.vo.RestTemplateVO;
import org.bouncycastle.asn1.ocsp.ResponderID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Employee> saveData(@Valid @RequestBody Employee employee){
        return ResponseEntity.ok(employeeServiceImpl.saveData(employee));
    }

    @GetMapping("/{empId}")
    public ResponseEntity<RestTemplateVO> getDataById(@PathVariable int empId){
        return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));
    }
}
