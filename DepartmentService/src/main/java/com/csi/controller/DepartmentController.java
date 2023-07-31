package com.csi.controller;

import com.csi.model.Department;
import com.csi.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentServiceImpl;

    @PostMapping("/")
    public ResponseEntity<Department> saveData(@RequestBody Department department) {
        return ResponseEntity.ok(departmentServiceImpl.saveData(department));
    }

    @GetMapping("/{deptId}")
    public ResponseEntity<Optional<Department>> getDataById(@PathVariable int deptId) {
        return ResponseEntity.ok(departmentServiceImpl.getDataById(deptId));
    }
}
