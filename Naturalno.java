import java.util.*;

public class Naturalno{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0; // It initializes a variable sum to store the sum of natural numbers.
        for(int i=0; i<=n; i++){
            sum = sum + i; 
        }
        System.out.println(sum);

    }
}