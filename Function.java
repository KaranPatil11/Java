import java.util.*;

public class Function{

    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static void main(String [] args){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);  // we called the Function here
    
    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int calculateProduct(int a, int b ){
    //     // int product = a * b;
    //     // return product;
    //     return a * b; // we can directly calculate any value no need to define a new variable
    // }

    // public static void main(String [] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
        
    //     // int product = calculateProduct(a, b); we can directly calculate any value no need to define a new variable
    //     System.out.println("Product of two number is : " + calculateProduct(a, b));
    //     }

    public static void printFactorial(int n){
        
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        } 
        System.out.println(factorial);
        return;
    }
    

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}