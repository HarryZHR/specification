package com.zhr.specification.student;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Harry.zhang on 2018/11/16
 */
public interface StudentService {

    /**
     * 通过姓名查找学生
     *
     * @param name     姓名
     * @param pageable 分页
     * @return 学生
     */
    Page<Student> pageStudentByName(String name, Pageable pageable);

    Page<Student> pageStudentSearch(String studentName, Integer studentAge, String gender, String address, Pageable pageable);
}
