package org.designPattern.buiderDP;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setUserId("1234")
                .setUserName("Akhil")
                .setUserEmail("akhil@gmail.com")
                .build();
        System.out.println(user);

        User user1= User.UserBuilder.userBuilder()
                .setUserId("456")
                .setUserName("Anuj")
                .setUserEmail("anuj@gmail.com")
                .build();

        System.out.println(user1);

    }
}
