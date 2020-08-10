package com.vasista.studentmanager.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasista.studentmanager.model.Studentmanager;
import com.vasista.studentmanager.repository.StudentmanagerRepository;

@Service
public class StudentmanagerService {

    @Autowired
    StudentmanagerRepository studentmanagerRepository;

    public List<Studentmanager> getAllstudentmanagers() {
        List<Studentmanager> studentmanagers = new ArrayList<Studentmanager>();
        studentmanagerRepository.findAll().forEach(studentmanager -> studentmanagers.add(studentmanager));
        return studentmanagers;
    }

    public Studentmanager getstudentmanagerById(int id) {
        return studentmanagerRepository.findById(id).get();
    }

    public void saveOrUpdate(Studentmanager mvoie) {
    	studentmanagerRepository.save(mvoie);
    }

    public void delete(int id) {
    	studentmanagerRepository.deleteById(id);
    }

}