package com.zhr.specification.classification;

import com.zhr.specification.student.Student;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

/**
 * @author Harry.zhang on 2018/11/16
 */
@Data
@Table(name = "classification")
@Entity
@DynamicUpdate
public class Classification {

    @Id
    @Column(name = "class_id")
    private Integer classId;

    @Column(name = "class_name")
    private String className;

    @OneToMany(mappedBy = "classification")
    private List<Student> students;
}
