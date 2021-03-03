import java.util.Scanner;
public class Player {
    private String name;
    private int score = 0;

    public Player(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
    }

    public String getName(){
        return name;
    }
    
    public int getScore(){
    return score;
    }

    public void increaseScore(){
        score = score + 1;
    }


}
