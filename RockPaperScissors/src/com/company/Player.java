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

    }

    public String getPlayerMove(){
        return playerMove;
    }
}
