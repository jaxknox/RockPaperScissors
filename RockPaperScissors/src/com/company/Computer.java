package com.company;
import java.util.Random;
public class Computer {

    private String computerMove;

    //constructor
    public Computer(){
        String[] moves = {"Rock", "Paper", "Scissors"};
        computerMove = "Rock";
    }


    public String getComputerMove(){
        return computerMove;
    }

    public void printComputerMove(){
        System.out.println("Computer move: " + computerMove);
    }
}
