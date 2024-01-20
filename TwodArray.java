import java.util.*;

public class TwodArray {

    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        // Input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        
        // Output 
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<rows; i ++){
            for(int j=0; j<cols; j++){
                // Compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
        
    } 
}
