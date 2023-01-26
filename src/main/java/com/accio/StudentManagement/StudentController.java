package com.accio.StudentManagement;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db= new HashMap<>();

     @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student){
        int id=student.getEnrollmentID();
        db.put(id,student);
        return "Student Added Successfully";
    }
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int id){
        return db.get(id);
    }
    @GetMapping("/get_student_name/{name}")
    public String getStudentName(@PathVariable("name") int id){
         Student student=db.get(id);
         return student.getName();
    }

}
