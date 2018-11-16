package com.zhr.specification.classification;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
