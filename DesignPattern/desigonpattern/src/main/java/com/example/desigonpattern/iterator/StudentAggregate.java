package com.example.desigonpattern.iterator;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 抽象聚合角色类
 * @date 2023/3/4 18:21:49
 */
public interface StudentAggregate {

    void addStudent(Student stu);

    void removeStudent(Student stu);

    StudentIterator getStudentIterator();
}
