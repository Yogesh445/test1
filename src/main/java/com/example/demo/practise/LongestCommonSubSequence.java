package com.example.demo.practise;

/*
 * Created by Yogesh Sharma on 2/07/2019.
 * */
public class LongestCommonSubSequence {

    public int getSubSequence(char[] str, char[] ptr, int M, int N) {

        if (M == 0 || N == 0) {
            return 0;
        }
        if (str[M - 1] == ptr[N - 1]) {

            return 1 + getSubSequence(str, ptr, M - 1, N - 1);
        } else {

            return Math.max(getSubSequence(str, ptr, M, N - 1), getSubSequence(str, ptr, M - 1, N));
        }

    }

    public static void main(String[] args) {
        LongestCommonSubSequence sequence = new LongestCommonSubSequence();
        char str[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char patern[] = {'e', 'c', 'd', 'g', 'i'};
        int len = sequence.getSubSequence(str, patern, str.length, patern.length);
        System.out.println("Length of max string:" + len);
    }

}
