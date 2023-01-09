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
        for (Student student : students) {
            if (student.getRegdNo() == regdNo) {
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.internalServerError().body("not found");
    }

    @PutMapping("/put/{rollNo}")
    public ResponseEntity<?> updateStudent(@PathVariable("rollNo") int rollNo, @RequestBody Student newStudent) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                student.setName(newStudent.getName());
                student.setRegdNo(newStudent.getRegdNo());
                student.setRollNo(newStudent.getRollNo());
                student.setPhone(newStudent.getPhone());

                return ResponseEntity.ok(student);
            }

        }
        return ResponseEntity.internalServerError().body("not found");
    }

}
