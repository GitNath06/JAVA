import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        int data[] = new int[n];
        int data_rev[]=new int[n];
        int temp;
        //for data entry 
        System.out.println("Enter the Elements:");
        for(int i=0;i<n; i++){
            data[i]=sc.nextInt();

        }

        //for reversing the array elements ;
        // method -1: By creating a new array
         
        /* 
        for(int i=0; i<n;i++){
            for(int j=n-i-1;j>=0;j--){
                data_rev[j]=data[i];
            }
        }
        */
        // method-2:
        /* 
        for(int i=0; i<n;i++){
            data_rev[n-1-i]=data[i];
        }
        */
        method-3: Without creating a new array
        for(int i=0;i<n/2; i++){
            temp=data[i];
            data[i]=data[n-i-1];
            data[n-i-1]=temp;
        }
        
        System.out.println("The Elements in Reverse Order : ");

        for(int i=0;i<n; i++){
            System.out.print(data[i]+" ");
        }

    }
}
