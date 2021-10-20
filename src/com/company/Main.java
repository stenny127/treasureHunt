package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        
        Random random = new Random();
        int coins = random.nextInt(100);



        String [][] board = new String [10][8];

        for (int i=0; i<10; i++) {
            for(int j=0; j<8; j++){
                board[i][j] = "[]";
            }
        }

        for (int i=0; i<10; i++) {
            board[random.nextInt(10)][random.nextInt(8)] = Integer.toString(coins);
        }
        for (int i=0; i<10; i++) {
            for(int j=0; j<8; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

    }
}
