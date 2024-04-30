import java.util.Scanner;
import java.io.*;
public class multiplication_of_matrices {
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows (rows = column for multiplication) of Matrix: ");
        int row=sc.nextInt();
        int cols=row;

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
                c[i][j]=0;
                for(int k=0; k<row;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        
        //for output
        System.out.println("The product of two matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
          
    }
}
