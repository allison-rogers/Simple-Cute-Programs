import java.util.*;

public class SumDigits{
public static void main (String args[]){
Scanner scan = new Scanner(System.in);


//prompt
   System.out.println("Enter a number of any length:");
   String numstring = scan.nextLine();

//define variables
   int length;
   String [] digits1;

//check negative
   String [] delete = numstring.split("-");
   if(delete.length > 1){
      digits1 = delete[1].split("");
      length = delete[1].length();
   } else{
      digits1 = delete[0].split("");
      length = delete[0].length();
   }
   
   //convert string to int
   int [] digits2 = new int [length];
   for (int i=0; i<length; i++) {
      digits2[i] = Integer.parseInt(digits1[i]);
   }
   
   //print digits and sum
   int sum = digits2[0];
   System.out.print("Your digits were: " + digits2[0]);
   for(int j=1; j<length; j++){
      System.out.print(", " + digits2[j]);
      sum = sum+digits2[j];
   }
   System.out.println();
   System.out.print("The sum of these digits is: " + sum);


}
}