package org.designPattern.observerDesignPattern;


public interface Subject {

    void subscribe(Observer ob);

    void unsubscribe(Observer ob);

    void videoUploaded();
}
