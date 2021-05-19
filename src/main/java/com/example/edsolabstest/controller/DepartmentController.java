package com.example.edsolabstest.controller;

import com.example.edsolabstest.model.Department;
import com.example.edsolabstest.service.department.DepartmentService;
import com.example.edsolabstest.service.department.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImp departmentServiceImp;

    @GetMapping("/list")
    public ResponseEntity<List<Department>> showALl(){
        return new ResponseEntity<>(departmentServiceImp.findAll(), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        return new ResponseEntity<>(departmentServiceImp.save(department), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}/delete")
    public ResponseEntity<Department> delDepartment(@PathVariable Long id){
        departmentServiceImp.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("{id}/edit")
    public ResponseEntity<Department> editDepartment(@PathVariable Long id, @RequestBody Department department){
        department.setId(id);
        departmentServiceImp.save(department);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
