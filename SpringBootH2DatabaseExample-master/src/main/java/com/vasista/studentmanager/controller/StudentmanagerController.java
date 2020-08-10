package com.vasista.studentmanager.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vasista.studentmanager.model.Studentmanager;
import com.vasista.studentmanager.service.StudentmanagerService;

@RestController
public class StudentmanagerController {

    @Autowired
    StudentmanagerService studentmanagerService;

    @GetMapping("/studentmanagers")
    private List<Studentmanager> getAllstudentmanagers() {
        return studentmanagerService.getAllstudentmanagers();
    }

    @GetMapping("/studentmanagers/{id}")
    private Studentmanager getstudentmanager(@PathVariable("id") int id) {
        return studentmanagerService.getstudentmanagerById(id);
    }

    @DeleteMapping("/studentmanagers/{id}")
    private void deletestudentmanager(@PathVariable("id") int id) {
        studentmanagerService.delete(id);
    }

    @PostMapping("/studentmanagers")
    private int savestudentmanager(@RequestBody Studentmanager studentmanager) {
        studentmanagerService.saveOrUpdate(studentmanager);
        return studentmanager.getId();
    }
}