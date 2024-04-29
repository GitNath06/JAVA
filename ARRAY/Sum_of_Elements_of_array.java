import java.util.Scanner;

public class Sum_of_Elements_of_array {
public static void main(String[] a){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of Elements:");
    int n= sc.nextInt();
    int data[]= new int[n];
    int sum=0;
     
    System.out.println("Enter the Data: ");
    for(int i=0; i<n ; i++){
        data[i]=sc.nextInt();
    }

    for(int i=0; i<n ; i++){
        sum+=data[i];
    }

    System.out.println("The sum of element is: " + sum);


}

}
