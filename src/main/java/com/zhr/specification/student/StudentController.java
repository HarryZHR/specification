package com.zhr.specification.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Harry.zhang on 2018/11/16
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(params = "action=one_property")
    public Page<Student> pageStudentByOneProperty(@RequestParam(value = "studentName") String studentName,
                                                  @RequestParam(value = "pageNumber", required = false, defaultValue = "1") Integer pageNumber,
                                                  @RequestParam(value = "pageSize", required = false, defaultValue = "3") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
        return studentService.pageStudentByName(studentName, pageRequest);
    }

    @GetMapping(params = "action=search")
    public Page<Student> pageStudentSearch(@RequestParam(value = "studentName") String studentName,
                                           @RequestParam(value = "studentAge") Integer studentAge,
                                           @RequestParam(value = "gender") String gender,
                                           @RequestParam(value = "address") String address,
                                           @RequestParam(value = "pageNumber", required = false, defaultValue = "1") Integer pageNumber,
                                           @RequestParam(value = "pageSize", required = false, defaultValue = "3") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
        return studentService.pageStudentSearch(studentName, studentAge, gender, address, pageRequest);
    }
}
