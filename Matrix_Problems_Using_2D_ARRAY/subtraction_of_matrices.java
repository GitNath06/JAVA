import java.util.Scanner;
import java.io.*;
public class subtraction_of_matrices {
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumns of Matrix: ");
        int row=sc.nextInt();
        int cols=sc.nextInt();

        int a[][]=new int[row][cols];
        int b[][]=new int[row][cols];
        int c[][]=new int[row][cols];
        
        //for input
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }

        // for operation 
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        
        //for output
        System.out.println("The Difference of two matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
          
    }
}
