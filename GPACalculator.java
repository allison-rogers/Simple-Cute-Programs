import java.util.Scanner;
public class GPACalculator {

static void getGrade(int grade){

    double result = 0;

if (grade>=0){
    if(grade <60){
        result = 0.0;
    } else if (grade<=62){
        result = 0.7;
    } else if (grade >= 95){
        result = 4.0;
    } else {
        
        result = ((grade-62) * 0.1)+0.7;

    }
    
    System.out.print("Your GPA is ");
    System.out.format("%.1f", result);
    
} else{
    System.out.println("HOW did you manage to mess up that badly???");
}

}


public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input your grade: ");
    int gradeinput = scan.nextInt();
    getGrade(gradeinput);
    
}
}
