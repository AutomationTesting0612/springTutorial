package org.designPattern.observerDesignPattern;

public class Subscriber implements Observer{

    String name;

    Subscriber(String name) {
        this.name=name;
    }
    @Override
    public void notified() {
        System.out.println("Hello " + this.name + " The new video is uploaded");
    }
}
