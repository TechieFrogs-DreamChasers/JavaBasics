package assignment;



public class oddoreven {
    public static void main (String[]args) {
       /* int i = 16;
        if ( i%2 == 0){
            System.out.println(" Number is Even " + i);
        }
        else{
            System.out.println(" Number is odd " + i);
        }
    }*/
     int i = 16;
     
     switch (i%2){
         case 1:
         System.out.println("Number is odd");
         break;
         case 0:
         System.out.println(" Number is even" + i);
         break;
         default:
         System.out.println(" number is not vailable");
     }





    
}
}
