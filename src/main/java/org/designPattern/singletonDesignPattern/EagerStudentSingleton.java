package org.designPattern.singletonDesignPattern;

public class EagerStudentSingleton {

    private static EagerStudentSingleton eagerStudentSingleton = new EagerStudentSingleton();

    private EagerStudentSingleton() {

    }

    public static EagerStudentSingleton getEagerStudentSingleton(){
        return eagerStudentSingleton;
    }
}
