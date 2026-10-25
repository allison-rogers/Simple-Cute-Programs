//Averages the temperature over a given amount of days

import java.util.*;
public class TemperatureAverager{
public static void main(String args[]){

//variables & constructs
Scanner scan = new Scanner(System.in);
int sum = 0;
int avg = 0;
int count = 0;


//Prompts & input
System.out.println("How many days will be averaged?");

int days = scan.nextInt();
int [] temp = new int [days];

System.out.println("Please enter the " + days + " temperatures.");


//Display & Calculations
for(int i=0;i<days;i++){
   temp[i] = scan.nextInt();
   sum = sum +temp[i];
}

for(int i=0;i<days;i++){
   System.out.println("Day " + (i+1) + ": " + temp[i] + " degrees");
   avg = sum/days;
}

for(int i=0;i<days;i++){
   if(temp[i]>avg){
      count++;
   }
}


//Data Output
Arrays.sort(temp);
System.out.println("Temperature scale: " + Arrays.toString(temp));
System.out.println("The average temperature is: " + avg + " degrees.");
System.out.println(count + " days were above average.");
System.out.println("Hottest temperature: " + temp[days-1]);
System.out.println("Coolest temperature: " + temp[0]);


}
}