package org.designPattern.singletonDesignPattern;

public class LazyStudentSingletonSynchronized {

    private static LazyStudentSingletonSynchronized studentSingleton;

    private LazyStudentSingletonSynchronized(){

    }


    public static LazyStudentSingletonSynchronized get() {
        synchronized (LazyStudentSingletonSynchronized.class) {
            if (studentSingleton == null)
                studentSingleton = new LazyStudentSingletonSynchronized();

        };
        return studentSingleton;
    }

}
