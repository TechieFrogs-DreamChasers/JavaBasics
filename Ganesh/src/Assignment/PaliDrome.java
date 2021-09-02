package Assignment;

public class PaliDrome {
    public static void main(String[] args){
        int i = 12411;
        int temp = i;
        int total = 0;
        while(i!=0){
            total = total * 10 + i%10;
            i = i/10;
            
        }
        System.out.println("Number to be Reversed : "+total);
        System.out.println("Number to Verify : "+temp);
        if(total == temp){
            System.out.println("Number is Palidrome");
        }
        else{
            System.out.println("Number is not a palidrome");
        }
    }

    
}
