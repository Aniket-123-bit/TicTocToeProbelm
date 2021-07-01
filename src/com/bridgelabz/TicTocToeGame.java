package com.bridgelabz;
//UC3
import java.util.Scanner;

public class TicTocToeGame {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to TicTocToe Game");
        char[] board = new char[10];

        System.out.println("Game initiated!");

        // Display the initial board
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        showboard(board);

        char inputChoice = chooseLetter();
        char computer;
        if (inputChoice == 'X')
            computer='O';
        else
            computer = 'X';

        System.out.println("Player has chosen " + inputChoice+ "computer "+computer);

    }

    public static void showboard(char[] board) {
        System.out.println("\n" + "Displaying the Tic Tac Toe Board");
        System.out.println(board[0] + "  " + board[1] + "  " + board[2]);
        System.out.println(board[3] + "  " + board[4] + "  " + board[5]);
        System.out.println(board[6] + "  " + board[7] + "  " + board[8]);
    }

    public static char chooseLetter() {
        System.out.println("\n" + "Enter your choice: X | O");
        char choice = input.next().charAt(0);

        return choice;
    }


}









