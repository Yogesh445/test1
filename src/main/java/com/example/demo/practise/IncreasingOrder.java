package com.example.demo.practise;

import java.util.Arrays;

public class IncreasingOrder {

    public static void main(String[] args) {

        int arr[] = {10, 9, 12, 8, 14, 15, 5};
        int temp[] = new int[arr.length];
        Arrays.fill(temp, 1);
        int maxResult = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {

                    temp[i] = Math.max(temp[i], 1 + temp[j]);
                }

            }
            maxResult = Math.max(maxResult, temp[i]);
        }
        System.out.println("Max increasing order is:" + maxResult);
    }
}
