//rolls 2 dice until you get a 7

import java.util.*;

public class DiceRoller{

public static void main(String args[]){

Random rand = new Random();
Scanner scan = new Scanner(System.in);

int rolls = 0;
int x = 0;
int y = 0;
int count = 0;

while (rolls != 7){
   System.out.println("Press 1 to roll");
   int roll = scan.nextInt();
   if (roll==1){
      x = rand.nextInt(6)+1;
      y = rand.nextInt(6)+1;
      rolls = x+y;
   }
   System.out.println(x + " + " + y + " = " + rolls);
   count++;
}

System.out.println("You got 7! It took " + count + " tries.");

}
}