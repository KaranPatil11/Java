import java.util.*;

public class Condition{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is Odd");
        }


    }
}