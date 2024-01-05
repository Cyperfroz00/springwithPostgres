package com.postgrest.demo.entity;
import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name ="mt_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "date_of_birth")
    private Date DateOfBirth;
    @Column(name = "address")
    private String address;

    public EmployeeEntity(Long id, String name, String gender, Date dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.DateOfBirth = dateOfBirth;
        this.address = address;
    }

    public EmployeeEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
