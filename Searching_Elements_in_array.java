import java.util.*;
public class Searching_Elements_in_array {
    public static void main(String[] args){
        int[] data_set = {
            223, 196, 178, 173, 131, 77, 123, 26, 87, 15,
            120, 195, 173, 165, 55, 180, 90, 56, 14, 39,
            105, 84, 138, 190, 114, 144, 198, 23, 72, 129,
            4, 33, 118, 67, 46, 164, 79, 135, 149, 111,
            57, 88, 175, 12, 130, 141, 72, 18, 57, 164,
            112, 86, 81, 183, 61, 146, 155, 90, 154, 75,
            133, 47, 92, 121, 118, 160, 85, 70, 175, 192,
            171, 81, 43, 23, 37, 157, 56, 141, 191, 100,
            130, 77, 111, 60, 175, 96, 139, 62, 140, 54,
            89, 155, 107, 72, 102, 29, 121, 94, 164, 145,
            38, 48, 24, 155, 128, 39, 16, 96, 111, 20,
            184, 13, 86, 95, 180, 92, 152, 45, 141, 47,
            186, 168, 89, 153, 36, 161, 17, 63, 141, 62,
            47, 129, 59, 36, 185, 155, 22, 45, 104, 150,
            13, 120, 139, 134, 31, 198, 50, 167, 139, 139,
            161, 91, 133, 55, 107, 122, 49, 87, 80, 186,
            158, 186, 73, 130, 189, 76, 179, 24, 197, 45,
            100, 51, 61, 107, 170, 85, 142, 76, 159, 61,
            58, 39, 168, 86, 184, 30, 178, 126, 10, 85,
            116, 135, 85, 53, 97, 50, 79, 116, 48, 55,
            26, 64, 62, 132, 79, 17, 104, 20, 67, 123,
            104, 32, 113, 72, 77, 168, 108, 92, 129, 137
        };
        System.out.println("The size of data_set is " + data_set.length );
        Scanner sc = new Scanner(System.in);
        System.out.println("The the data to search: ");
        int n=sc.nextInt();
        int index=-1;

        for(int i =0; i<200; i++){
            if(n == data_set[i]){
                index=i;
                break;
            }
           
        }
        if(index!=-1){
            System.out.println("The Element has been found! at index: "+ index);
        }
        else{
            System.out.println("The Element has not been found! in the data set");

        }
    }
}
