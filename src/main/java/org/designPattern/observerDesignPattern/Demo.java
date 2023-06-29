package org.designPattern.observerDesignPattern;

public class Demo {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber subscriber = new Subscriber("Anuj");
        channel.subscribe(subscriber);
        channel.videoUploaded();
    }
}
