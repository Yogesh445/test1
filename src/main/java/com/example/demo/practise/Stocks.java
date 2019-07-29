package com.example.demo.practise;

/*
 * Created by Yogesh Sharma on 05/06/2019.
 * */
public class Stocks {

    public static void main(String[] args) {

        int arr[] = {100, 180, 260, 310, 40, 535, 695};
        int min[] = new int[arr.length / 2 + 1];
        int max[] = new int[arr.length / 2 + 1];
        int i = 0;
        int j = 1;
        int k = 0;
        int w=0;
        int len = arr.length;

        while (i < len - 1) {

            while (i < len - 1 && arr[i] < arr[i + 1]) {
                i++;
            }
            min[k]=i++;
            k++;
            while (i<len-1 && arr[i]>arr[i-1]){
                i++;
            }
            max[w]=i-1;
             w++;
        }
        System.out.println("here is day of buying:"+min);
        System.out.println("Here is day of selling:"+max);
    }
}
