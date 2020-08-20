package com.example.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/fetch")
public class StudentController
{
    @Autowired
    StudentService service;
    @PostMapping("/save")
    private void insert(@RequestBody StudentEntity[] student)
    {
       service.enter(student);
    }
    @GetMapping("/fetchAll")
    private List<StudentEntity> getAllDetails()
    {
        return service.getAllDetails();
    }
    @GetMapping("/fe/{sphoneno}")
    private StudentEntity getBySphoneno(@PathVariable("sphoneno")long sphoneno)
    {
       return service.getBySphoneno(sphoneno);
    }
    @Transactional
    @DeleteMapping("/fe/{sphoneno}")
    public void delete(@PathVariable("sphoneno") long sphoneno)
    {
        service.deleteBySphoneno(sphoneno);
    }
}
