package PRACTICE;

import java.util.Scanner;

import InterfacesExercise.Program3;

public class Check implements Program3{
    
    public void method1(){

    }
    public void method2(){

    }
    public void method3(){

    }
    public static void main(String[] args){
       /* int num=6;
        
        if( num > 0){
            System.out.println("The number is positive"); 
        }
        else{
            System.out.println("The number is positive");
        }
        if ((num%2)==0)  
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
        
        String out=(num>0)?("Positive number"):("Negative number");
        System.out.println(out);    
        //Check check = new Check();
        //check.i = 20;*/
                //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //int num = Integer.parseInt(br.readLine());
                Scanner obj = new Scanner(System.in);
                int num = obj.nextInt();
                if(num>0 && num<1000){
                    if(num%2==0){
                        if(num/10 == 0){
                            System.out.println("even single-digit number");
                        }
                        else if(num/100 ==0){
                                System.out.println("even two-digit number");
                        }
                        else if(num/1000 ==0){
                                System.out.println("even three-digit number");
                        }
                            
                    }
                    else{
                        if(num/10 ==0){
                            System.out.println("odd single-digit number");
                        }
                        else if(num/100 ==0){
                            System.out.println("odd two-digit number");
                        }
                        else if(num/1000 == 0){
                            System.out.println("odd three-digit number");
                        }
                        
                        
                    }
                
                    
                }
                
                    //write your code here
        
            }
        }
        
    }
}