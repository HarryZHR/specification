package com.zhr.specification.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Harry.zhang on 2018/11/16
 */
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Page<Student> pageStudentByName(String name, Pageable pageable) {
        return studentRepository.findByStudentNameLike("%" + name + "%", pageable);
    }

    @Override
    public Page<Student> pageStudentSearch(String studentName, Integer studentAge, String gender, String address, Pageable pageable) {
        /*Specification<Student> specification = (root, query, criteriaBuilder) -> {
            List<Predicate> list = new ArrayList<>();
            List<javax.persistence.criteria.Predicate> list = new ArrayList<>();
//            if (org.apache.commons.lang3.StringUtils.isNotBlank(studentName)) {
//                list.add(cb.like(root.get("studentName"), "%" + studentName + "%"));
//            }
//
//            root.join(root.getModel().getSingularAttribute("clazz", Clazz.class), JoinType.LEFT);
//
//
//            if (studentAge != null) {
//                list.add(cb.equal(root.get("studentAge"), studentAge));
//            }
//
//            if (StringUtils.isNotBlank(clazzName)) {
//                javax.persistence.criteria.Predicate likeP1 = cb.like(root.get("clazz").get("clazzName").as(String.class), "%" + clazzName + "%");
//                list.add(cb.and(likeP1));
//            }
//
//            //左连接
//            //root.join(root.getModel().getSingularAttribute("sysUsersX",SysUsersX.class),JoinType.LEFT);
////            Predicate likeP1 = cb.like(root.get("name").as(String.class),"%"+sSearch+"%");
////            //Predicate likeP2 = cb.like(depJoin.get("businessNumber").as(String.class), "%"+sSearch+"%");
////            Predicate likeP2 = cb.like(root.get("businessNumber").as(String.class), "%"+sSearch+"%");
////            Predicate orP = cb.or(likeP1,likeP2);
////            //参考： http://www.iteye.com/problems/92130
////            return cb.and(cb.conjunction(),orP);
//
//
//            javax.persistence.criteria.Predicate[] p = new javax.persistence.criteria.Predicate[list.size()];
//            return cb.and(list.toArray(p));
        }*/

//        return studentRepository.findAll();
        return null;
    }
}
