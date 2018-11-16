package com.zhr.specification.student;

import com.zhr.specification.base.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Harry.zhang on 2018/11/16
 */
public interface StudentRepository extends BaseRepository<Student, Integer> {

    /**
     * 分页搜索姓名
     * @param name 姓名
     * @param pageable 分页
     * @return 学生
     */
    Page<Student> findByStudentNameLike(String name, Pageable pageable);
}
