package com.company;

public class GameLogic {

    private int playerScore;
    private int computerScore;

    //constructor
    public GameLogic(){

    }


    public void logic(Computer computerMove, Player playerMove){

        if(playerMove.getPlayerMove().equals(computerMove.getComputerMove())){  //tie
            System.out.println("Tie!");
        }
        else if(playerMove.getPlayerMove().equals("Rock") && computerMove.getComputerMove().equals("Scissors")){ // player win cases
            System.out.println("Player wins!");
            playerScore++;
        }
        else if(playerMove.getPlayerMove().equals("Paper") && computerMove.getComputerMove().equals("Rock")){
            System.out.println("Player wins!");
            playerScore++;
        }
        else if(playerMove.getPlayerMove().equals("Scissors") && computerMove.getComputerMove().equals("Paper")){ // end player win cases
            System.out.println("Player wins!");
            playerScore++;
        }
        else if(playerMove.getPlayerMove().equals("Rock") && computerMove.getComputerMove().equals("Paper")){ // computer win cases
            System.out.println("Computer wins!");
            computerScore++;
        }
        else if(playerMove.getPlayerMove().equals("Paper") && computerMove.getComputerMove().equals("Scissors")){
            System.out.println("Computer wins!");
            computerScore++;
        }
        else if(playerMove.getPlayerMove().equals("Scissors") && computerMove.getComputerMove().equals("Rock")){ // end computer win cases
            System.out.println("Computer wins!");
            computerScore++;
        } else {
            System.out.println("Something went wrong. Please try again.");
        }
    }


    public int getPlayerScore(){
        return  playerScore;
    }

    public int getComputerScore(){
        return computerScore;
    }

}
