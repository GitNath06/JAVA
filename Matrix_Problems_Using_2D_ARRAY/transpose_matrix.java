import java.util.*;
import java.io.*;
public class transpose_matrix{
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumns of Matrix: ");
        int row=sc.nextInt();
        int cols=sc.nextInt();

        int a[][]=new int[row][cols];
    
        
        //for input
        System.out.println("Enter the elements of Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        //for output of input matrix
        System.out.println("The input matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");

        //for transpose operation and displaying it.
        System.out.println("The transpose of matrix is: ");
        for(int i=0;i<cols;i++){
            for(int j=0;j<row;j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println(" ");
        } 
                  
    }
}