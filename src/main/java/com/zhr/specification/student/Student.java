package com.zhr.specification.student;

import com.zhr.specification.classification.Classification;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private Classification classification;

}
