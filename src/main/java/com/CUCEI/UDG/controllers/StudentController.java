package com.CUCEI.UDG.controllers;

import com.CUCEI.UDG.models.StudentModel;
import org.springframework.web.bind.annotation.*;
import com.CUCEI.UDG.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping()
    public StudentModel saveStudent(@RequestBody StudentModel studentModel){
        return studentService.saveStudent(studentModel);
    }

    @GetMapping()
    public List<StudentModel> getAllStudents(){
        return studentService.getAllStudents();
}

    @GetMapping("/findByCode={code}")
    public Optional<StudentModel> findStudentByCode(String code){
        return studentService.findStudentByCode(code);
    }

    @GetMapping("/findByName={name}")
    public Optional<StudentModel> getStudentByName(@PathVariable String name){
        return studentService.findStudentByCode(name);
    }

    @DeleteMapping("/deleteStudentByCode={code}")
    public String deleteStudentByCode(@PathVariable String code){
        return studentService.deleteStudentByCode(code);
    }

    @PutMapping("")
    public StudentModel UpdateStudent(@RequestBody StudentModel studentModel){
        return studentService.saveStudent(studentModel);
    }

    @PutMapping("/updateStudentByCode={code}")
    public StudentModel UpdateStudent(@PathVariable String code, @RequestBody StudentModel studentModel){
        return studentService.updateStudentByCode(code,studentModel);
    }

}
