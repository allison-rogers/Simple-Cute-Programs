import java.util.*;
import java.io.*;
public class NumberGame {
public static void main(String[] args){

//initialize
   Scanner scan = new Scanner(System.in);
   Random rand = new Random ();
   int initial = rand.nextInt(81);
   int x = initial + 10;
   int g = 0;
   boolean play = true;
   
//while loops
   while (play==true){
      System.out.println("I just picked a random number between 10 and 90.");
      System.out.println("Can you guess what it is?");
     
      while (g != x){
   
         g = scan.nextInt();
     
         if(g>90 || g<10){
            System.out.println("That's not even in the bounds.");
         } else if (g>x){
            System.out.println("You wanna go a little lower.");
         }else if (g<x){
            System.out.println("You wanna go a little higher.");
         }
      }
     
      //play again
      System.out.println("Correct! The number was " + x + ". Would you like to play again?");
      System.out.println("Yes (Press 1)   No (Press 0)");
      int p = scan.nextInt();
      if(p==1){
         initial = rand.nextInt(81);
         x = initial + 10;
         g = 0;
      } else if (p==0){
         System.out.println("Bye!");
         play=false;
      } else{
         System.out.println("That wasn't in bounds, now you CAN'T play again.");
         play=false;
      }

     
   }


}
}