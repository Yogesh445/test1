package com.example.demo.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DyingTree {

    public static void main(String[] args) {

        int[] arr = {10, 8, 12, 13, 14, 15, 9, 3};
        int index[] = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        int day = 0;
        int previousDay = 0;
        int currentDay = arr.length;
        while (previousDay != currentDay) {
            previousDay = arr.length;
            int i = 1;
            int j = 0;
            while (i < arr.length) {

                if (arr[i] > arr[j]) {
                    list.add(arr[i]);
                }
                i++;
                j++;
            }
            List<Integer> aList = Arrays.stream(arr).boxed().collect(Collectors.toList());

            aList.removeAll(list);
            arr = aList.stream().mapToInt(Integer::intValue).toArray();
            day++;
            currentDay = arr.length;
        }
        System.out.println("Day:" + day);
    }

}
