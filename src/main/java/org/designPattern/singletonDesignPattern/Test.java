package org.designPattern.singletonDesignPattern;

import org.designPattern.singletonDesignPattern.EagerStudentSingleton;
import org.designPattern.singletonDesignPattern.LazyStudentSingleton;

public class Test {

    public static void main(String[] args) {

        LazyStudentSingleton s1= LazyStudentSingleton.get();
        System.out.println(s1.hashCode());

        LazyStudentSingleton s2= LazyStudentSingleton.get();
        System.out.println(s2.hashCode());

        System.out.println(EagerStudentSingleton.getEagerStudentSingleton().hashCode());
        System.out.println(EagerStudentSingleton.getEagerStudentSingleton().hashCode());
    }
}
