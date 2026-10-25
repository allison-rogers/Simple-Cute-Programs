//This homework was to create a specific shape using loops.

public class FunLoopShape {
public static void main(String[] args){

for (int i=7; i>0; i--){
    System.out.println();
        for(int j=(i-2);j>=0;j--){
            System.out.print("*");
        }
        for(int k=(i-1);k<7;k++){
            System.out.print(" ");
        }
        for(int h=(i-2);h>=0;h--){
            System.out.print("//");
        }
       for(int r=(i-1);r<6;r++){
            System.out.print("\\\\");
        }
        for(int p=(i-1);p<7;p++){
            System.out.print(" ");
        }
        for(int q=(i-2);q>=0;q--){
            System.out.print("*");
        }
}






}
}
