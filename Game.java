import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private boolean playAgain = true;
    
    
    public Game(){
    player1 = new Player();
    player2 = new Player();
    }

    //big method :O
    public void play(){
        Scanner sc = new Scanner(System.in);
        Player starterPlayer;
        
        
        //prompts for input, checks and changes pieces
        while(playAgain == true){
            
        int currentPlayer = (int)(Math.random() + 1);
        if(currentPlayer == 1){
            starterPlayer = player1;
        }else{
            starterPlayer = player2;
        }

        
        while(Board.getNumPieces() > 1){
            
            System.out.println("There are " + Board.getNumPieces() + " pieces.\n");
            System.out.println(starterPlayer.getName() + ", you are up! How many pieces will you remove?");
            
            int num = sc.nextInt();
            //CHECK RESPONSE
            while((num < 1) || (num > Board.getNumPieces()/2)){
                System.out.println("Invalid input, " + starterPlayer.getName() + "! Please enter a different number of pieces");
                num = sc.nextInt();
            }
                //removing amount of pieces player chose to remove
                Board.removePieces(num);
                //switch playas!
                if(currentPlayer == 1){
                    currentPlayer = 2;
                    starterPlayer = player2;
                }else{
                    currentPlayer = 1;
                    starterPlayer = player1;
                }
            }
            if(currentPlayer == 1){
                player1.increaseScore();
            }else{
                player2.increaseScore();
            }
            System.out.println(starterPlayer.getName() + " has won the game!");
            System.out.println(player1.getName() + " points: " + player1.getScore());
            System.out.println(player2.getName() + " points: " + player2.getScore());
        } 

    }

}

//determine the winner
//print the winner
//playAgain y or n?
//if playAgain.equals("y").... if playAgain.equals("N") etc.
