import java.util.*;

public class Condition1{

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == b){
            System.out.println("Equal");
        }
        else if(a > b)  //we can remove curly bresis in if and elseif and else condition as it executes imidiate next line after it
            System.out.println("a is greater than b");
        
        else{
            System.out.println("a is smaller than b");
        }
     
    }
}