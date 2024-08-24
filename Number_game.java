import java.util.Scanner;
import java.util.*;
class Number_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Chances=10;
        int Finals=0;
        boolean playAgain=true;
        System.out.println("Welcome to the Number Game");
        System.out.println(" Hello Player You have " + Chances +" Chances to win the game");
        while(playAgain){
            int random =getrandomNumber(1,100);
            boolean guess =false;
            for(int i=0;i<Chances;i++){
                System.out.println("Chance " + (i+1) + " : Enter your Guess:");
                int user=sc.nextInt();
                 if(user==random){
                 guess=true;
                 Finals+=1;
                 System.out.println("you won it.");
                 break;
                }
                else if(user > random){
                 System.out.println("Too High");
                }
                else{
                  System.out.println("Too Low");

                }
            }
             if(guess==false){
            System.out.println("Sorry Player. You Lost your Chances ");

             }
            System.out.println("Do you want to Play Again? (Yes/No)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("Yes");

        }

        System.out.println("Hope You enjoyed the Game");
        System.out.println("here is Your score:"+Finals);
    }

        public static int getrandomNumber(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);

        }
    
}
    


