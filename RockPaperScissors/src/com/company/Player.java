package com.company;
import java.util.Scanner;

public class Player {

    private String playerMove;

    //constructor
    public Player(){

    }

    public void getPlayerInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select your move: (R)ock, (P)aper, (S)cissors");
        playerMove = scanner.nextLine().toUpperCase();

        switch (playerMove){
            case "R" -> playerMove = "Rock";
            case "P" -> playerMove = "Paper";
            case "S" -> playerMove = "Scissors";
        }

    }

    public String getPlayerMove(){
        return playerMove;
    }

    public void printPlayerMove(){
        System.out.println("Your move: " + playerMove);
    }


}
