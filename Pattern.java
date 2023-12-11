import java.util.*;

public class Pattern{

    public static void main(String args[]){
// ----------------nested Loops----------------------
    //    Scanner sc = new Scanner(System.in);
       int a =  5;       // sc.nextInt();
       int b =  5;       // sc.nextInt();

       for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                if(i == 1 || j == 1 || i == a || j == b){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
       }



    }
}