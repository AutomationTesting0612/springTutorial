package org.spring.springpractice.beancreationambiguityproblem;

public class Sum {

    private int num1;

    private int num2;

    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Sum(double num1, double num2) {
        this.num1 = (int) num1;
        this.num2 = (int) num2;
    }

    public Sum(String num1, String num2) {
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
    }

    @Override
    public String toString() {
        return "Sum{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
