package com.example.desigonpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 抽象聚合实现类
 * @date 2023/3/4 18:24:37
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> students = new ArrayList<Student>();

    @Override
    public void addStudent(Student stu) {
        students.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        students.remove(stu);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(students);
    }
}
