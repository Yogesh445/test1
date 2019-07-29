package com.example.demo.practise;

public class CoinsProblem {

    public int getWays(int coin[], int amount) {

        int table[][] = new int[amount + 1][amount + 1];

        for (int i = 0; i < coin.length; i++) {

            for (int j = 0; j <= amount; j++) {

                if (j == 0 || i == 0) {

                    table[i][j] = 1;

                } else {

                    if (i > j) {

                        table[i][j] = table[i - 1][j];

                    } else {
                        table[i][j] = table[i - 1][j] + table[i][j - i];
                    }
                }

            }

        }
        System.out.println("Here is total array:" + table);
        return table.length;

    }

    public static void main(String[] args) {

        CoinsProblem problem = new CoinsProblem();
        int arr[] = {0, 1, 2, 3};
        int amount = 5;
        System.out.println("total Ways:" + problem.getWays(arr, amount));

    }
}
