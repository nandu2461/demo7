package com.example.demo7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>
{
    StudentEntity findBySphoneno(long sphoneno);
    void deleteBySphoneno(long sphoneno);
}
