package com.example.demo7;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class StudentEntity
{
    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int sid;
    private long sphoneno;
    private String fname;
    private String lname;
    private String address;
    private long sparentphoneno;
    public StudentEntity()
    {

    }
    public int getId() {
        return sid;
    }
    public void setId(int sid) {
        this.sid = sid;
    }
    public long getSphoneno() {
        return sphoneno;
    }
    public void setSphoneno(long sphoneno) {
        this.sphoneno = sphoneno;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getSparentphoneno() {
        return sparentphoneno;
    }
    public void setSparentphoneno(long sparentphoneno) {
        this.sparentphoneno = sparentphoneno;
    }
}
