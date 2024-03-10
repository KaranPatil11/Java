import java.util.Scanner;

public class Array{

    public static void main(String [] args){

        // int [] marks = new int [3]; // int marks [] = new int [3];
        // int [] marks = {97, 95, 99};

        // marks[0] = 97; // Physics
        // marks[1] = 95; // Chemistry
        // marks[2] = 99; // Maths

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
    //     for(int i=0; i<3; i++){
    //         System.out.println(marks[i]);
    //     }
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt ();
        int [] numbers = new int[size];
        
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

                  //output
                  boolean isFound = false;
                  for(int i=0; i<numbers.length; i++){
                         if(numbers[i] == x){
                             System.out.println("x found at index : " + i);
                             isFound = true;
                             break; // exit the loop once x is found
                         }
                  }
                  if (!isFound) {
                        System.out.println("x not found");
                  }
                  
              }
             
        }
