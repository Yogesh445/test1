package com.example.demo.practise;

public class BruteForseAlgorithams {

    public static void main(String[] args) {

        String str = "I am java Programmer";
        String pattern = "Programmer";
        int ls = str.length();
        int lp = pattern.length();
        int max = (ls - lp + 1);
        for (int i = 1; i <= max; i++) {

            boolean isFound = true;
            int j = 1;
            while (j < lp && isFound) {
                if (pattern.charAt(j) != str.charAt(i + j - 1)) {
                    isFound = false;
                }

                j++;
            }
            if (isFound) {
                System.out.println("Starting with index:" + i);
            }
        }

    }
}
