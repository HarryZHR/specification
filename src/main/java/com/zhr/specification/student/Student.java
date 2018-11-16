package com.zhr.specification.student;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@DynamicUpdate
@Table(name = "student")
@Entity
public class Student {

    @Id
    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_age")
    private Integer studentAge;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

}
