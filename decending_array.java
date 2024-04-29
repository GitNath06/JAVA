import java.util.*;
public class decending_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();

        int data[] = new int[n];
        int temp;
        //for data entry 
        System.out.println("Enter the Elements:");
        for(int i=0;i<n; i++){
            data[i]=sc.nextInt();

        }

        //for sorting the data in decending order.
        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                if(data[i]<data[j]){
                    temp=data[i];
                    data[i]= data[j];
                    data[j]=temp;
                }
            }
        }
        
        System.out.println("The Elements in Decending Order : ");

        for(int i=0;i<n; i++){
            System.out.print(data[i]+" ");
        }
    }
    
}
