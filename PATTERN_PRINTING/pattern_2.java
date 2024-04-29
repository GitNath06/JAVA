public class pattern_2 {
    public static void main(String[] args) {

        // solid pattern
        /*
         **********
         *        *
         *        *
         *        *
         **********
         */
        
         for(int i=0; i<=8; i++){
            for(int j=0; j<=30; j++){
                if(i==0 || j==0 || i==8 || j==30 || j==1 || j==29){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
        
          System.out.println();
          System.out.println();

         for(int i=0; i<=8; i++){
            for(int j=0; j<=30; j++){
                if(i==0 || j==0 || i==8 || j==30 || j==1 || j==29){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
        
          System.out.println();
          System.out.println();
        

         for(int i=0; i<=8; i++){
            for(int j=0; j<=30; j++){
                if(i==0 || j==0 || i==8 || j==30 || j==1 || j==29){
                    System.out.print("%");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
        

    }

}
