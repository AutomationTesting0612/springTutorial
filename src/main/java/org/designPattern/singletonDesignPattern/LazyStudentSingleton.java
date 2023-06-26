package org.designPattern.singletonDesignPattern;

public class LazyStudentSingleton {

    private static LazyStudentSingleton studentSingleton;

    private LazyStudentSingleton(){

    }


    public static LazyStudentSingleton get() {
        if(studentSingleton == null)
         studentSingleton = new LazyStudentSingleton();
        return studentSingleton;
    }

}
