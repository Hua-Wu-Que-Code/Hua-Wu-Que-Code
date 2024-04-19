package com.example.desigonpattern.iterator;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description Students' abstract Iterator interface
 * @date 2023/3/4 17:14:53
 */
public  interface StudentIterator {

    boolean hasNext();

    Student next();
}
