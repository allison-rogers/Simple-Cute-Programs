//This Homework takes positive numbers, lists them in order, and tells you how many times each was typed

import java.util.*;

public class OrderDigits{
public static void main (String args[]){
Scanner scan = new Scanner(System.in);

//prompt
   System.out.println("One at a time, input a list of positive numbers.");
   System.out.println("When you are finished, input -999:");
   
//define variables
   int input [] = new int[100];
   int end = 0;
   int i = 0;
   
//fill array
   while(end != -999){
      input[i] = scan.nextInt();
      end = input[i];
      i++;
   }
   
//only positive numbers
   int length = i-1;
   int [] positive = new int [length];
   for(int j=0;j<100;j++){
      if(input[j] > 0){
         positive[j] = input[j];
      }
   }
   
   //housework
   Arrays.sort(positive);
   int tick [] = new int[length];
   System.out.println("Number      Count");
   
   //the loop of all time
   for(int h=0;h<length;h++){
   
      for(int k=0; k<length; k++){
         
         if(positive[h]==positive[k]){
            tick[h]++;
            
         }
      }
      
      if(h==0){
         System.out.println(positive[h] + "           " + tick[h]++);
         } else if(positive[h] != positive[h-1]){
            System.out.println(positive[h] + "           " + tick[h]++);
      }
   }




}
}