package com.accio.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    Map<Integer,Student> db= new HashMap<>();

    //Create
    @PostMapping("/add_student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String response= studentService.addStudent(student);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
   //get
    @GetMapping("/get_student")
    public ResponseEntity getStudent(@RequestParam("q") int id){
        Student student= studentService.getStudent(id);
        return new ResponseEntity<>(student,HttpStatus.FOUND);
    }
    //get
//    @GetMapping("/get_student_name/{name}")
//    public String getStudentName(@PathVariable("name") int id){
//         Student student=db.get(id);
//         return student.getName();
//    }

    @DeleteMapping("/delete_student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") int id){
        String response= studentService.deleteStudent(id);
        return new ResponseEntity<>(response,HttpStatus.UNAUTHORIZED);
    }
    //update database
    @PutMapping("/update_student")
    public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
        String response= studentService.updateStudent(id, age);
        return new ResponseEntity<>(response,HttpStatus.REQUEST_TIMEOUT);
    }
}
