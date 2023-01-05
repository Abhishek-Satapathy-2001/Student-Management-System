package com.studentmanagementsystem.controller;

import com.studentmanagementsystem.models.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    public static ArrayList<Student> students = new ArrayList<>();

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

    @GetMapping("/list")
    public ArrayList<Student> getStudents() {
        return students;
    }

    @GetMapping("/getDetails/{regdNo}")
    public ResponseEntity<?> getStudent(@PathVariable("regdNo") Long regdNo) {
        for(Student student : students) {
            if (student.getRegdNo() == regdNo) {
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.internalServerError().body("not found");
    }

}
