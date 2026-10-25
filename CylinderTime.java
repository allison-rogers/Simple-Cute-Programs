import java.util.*;

public class CylinderTime{
public static void main (String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Input the radius of the cylinder:");
int rad = scan.nextInt();
System.out.println("Input the height of the cylinder:");
int hei = scan.nextInt();

double vol = Math.PI * hei * (rad*rad);
System.out.println("The volume is: " + vol);

double sur = (Math.PI * 2 * hei * rad) + (Math.PI * 2 * (rad*rad));
System.out.println("The surface area is: " + sur);


}
}