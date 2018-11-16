package com.zhr.specification.course;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "course")
@Entity
@DynamicUpdate
public class Course {

    @Id
    @Column(name = "course_id")
    private Integer courseId;

    @Column(name = "course_name")
    private String courseName;
}
