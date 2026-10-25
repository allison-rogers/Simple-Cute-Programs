import java.util.Scanner;
public class DateReFormat {
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter a date in American format (ex: November 10, 2004):");

String date = scan.nextLine();

int pos1 = date.indexOf(" ");
int pos2 = date.indexOf(",");

String day = date.substring((pos1+1), pos2);
String month = date.substring(0, pos1);
String year = date.substring((pos2+2));

System.out.println("International Format: " + year + "-" + month + "-" + day);

}
}
