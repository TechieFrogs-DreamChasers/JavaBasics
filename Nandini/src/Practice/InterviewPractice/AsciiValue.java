package Practice.InterviewPractice;

public class AsciiValue {
    public static void main(String[] args) {
        
        for(char i='A';i<='z';i++){
            System.out.println("Ascii value of "+i+" is: "+(int)i);
        }

        for(int i=65;i<=90;i++){
            System.out.println("Ascii value of "+i+" is: "+ (char)i);
        }
    }
    
}
