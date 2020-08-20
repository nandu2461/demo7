package com.example.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {
    @Autowired
    StudentRepository repository;

    public void enter(StudentEntity[] Student) {
        for (StudentEntity st : Student) {
            System.out.println(st.getSphoneno() + " " + st.getFname() + " " + st.getLname() + " " + st.getAddress() + " " + st.getSphoneno());
            repository.save(st);
        }
    }

   //public List<StudentEntity> getAllDetails() {
    //    List<StudentEntity> student = repository.findAll();
     //   if (student != null || student.isEmpty()) {
     //       System.out.println("Student Detail Not Found");
     //   } else {
        //  for (StudentEntity st : student) {
        //      return (List<StudentEntity>) st;
        //   }}return student;}
   public List<StudentEntity> getAllDetails()
   {
      List<StudentEntity> student=new ArrayList<StudentEntity>();
        student=repository.findAll();
        return student;
    }

    public StudentEntity getBySphoneno(long sphoneno)
    {
       return repository.findBySphoneno(sphoneno);
    }
    public void deleteBySphoneno(long sphoneno)
    {
        repository.deleteBySphoneno(sphoneno);
    }
}

