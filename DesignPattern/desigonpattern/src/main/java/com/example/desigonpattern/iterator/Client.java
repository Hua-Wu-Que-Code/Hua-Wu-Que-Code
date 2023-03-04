package com.example.desigonpattern.iterator;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 测试类
 * @date 2023/3/4 18:27:34
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("tom",1));
        studentAggregate.addStudent(new Student("sam",2));
        studentAggregate.addStudent(new Student("jack",3));


        StudentIterator iterator = studentAggregate.getStudentIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
