public class Eigth {
    public static void main(String[] args) {
        int i, j=1;  
        int num=5; 
        for(i=1;i<=num;i++){    
            j=j*i;    
        }    
        System.out.println("Factorial of "+num+" is: "+j);    

        //Using while loop

        int num1 = 5, i1 = 1;
        long factorial = 1;
        while(i1 <= num1)
        {
            factorial *= i1;
            i1++;
        }
        System.out.printf("Factorial of %d = %d"   +num1, +factorial);

    }
    
}
