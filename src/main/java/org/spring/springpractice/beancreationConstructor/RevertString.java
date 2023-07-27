package org.spring.springpractice.beancreationConstructor;

public class RevertString {

    public static void main(String[] args) {

        String str= "My Name Is Spring";
        System.out.println(str);
        System.out.println("=====After Revering the program==============");

        char[] ch = str.toCharArray();

        for (int i = ch.length-1; i>=0;i--) {

          char[] ch1 = new char[]{str.charAt(i)};
            System.out.println(String.valueOf(ch1));
        }
    }
}
