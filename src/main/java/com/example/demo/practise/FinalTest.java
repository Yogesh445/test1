package com.example.demo.practise;

public class FinalTest {

    public int getNumber() {

        try {

            int d = 1 / 0;
        } catch (Exception e) {
            return 0;
        } finally {
            System.out.println("here is Finally!");
            return -1;
        }
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        int number = finalTest.getNumber();
        System.out.println("Number:" + number);
    }
}
