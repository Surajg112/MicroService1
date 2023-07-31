package com.csi.service;

import com.csi.model.Department;
import com.csi.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl {

    @Autowired
    DepartmentRepo departmentRepoImpl;

    public Department saveData(Department department){
        return departmentRepoImpl.save(department);

    }

    public Optional<Department> getDataById(int deptId){
        return departmentRepoImpl.findById(deptId);
    }
}
