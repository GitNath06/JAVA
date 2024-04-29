import java.util.*;
import java.io.*;

public class Larger_num{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of items: ");
    int x=sc.nextInt();
    int []nums = new int[x];
    
    System.out.println("Enter the items: ");
    for ( int i=0 ; i<x; i++){
        nums[i]= sc.nextInt();
               
    }
    int Larger_num= nums[0];
    for (int i=0;i<x; i++){
        if(Larger_num<nums[i]){
            Larger_num=nums[i];
        }

    }

    System.out.println("The Largest Number is : "+ Larger_num);


}
}
