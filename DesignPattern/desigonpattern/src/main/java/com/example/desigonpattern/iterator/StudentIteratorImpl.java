package com.example.desigonpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description Students' Iterator Implement Class
 * @date 2023/3/4 18:14:18
 */
public class StudentIteratorImpl implements StudentIterator{

    List<Student> students = new  ArrayList<Student> ();

    //record iterator position
    private int position = 0;

    public StudentIteratorImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        return students.get(position++);
    }
}
