package com.accio.StudentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> db= new HashMap<>();

    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent( Student student){
        int id=student.getEnrollmentID();
        db.put(id,student);
        return "Student Added Successfully";
    }

    public String deleteStudent( int id){
        db.remove(id);
        return "Delete Student SuccessFully";
    }
    public String updateStudent( int id, int age){
        db.get(id).setAge(age);
        return "Student age has been updated successfully";
    }
}
