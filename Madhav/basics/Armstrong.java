class Armstrong{  
    public static void main(String args[]){  
     int r,sum=0,temp;    
     int n=153;//It is the number variable to be checked for palindrome  
     
     temp=n;    
     while(n>0){    
      r=n%10;  //getting remainder  
      sum=(r*r*r)+sum;    
      n=n/10;    
     }    
     if(temp==sum)    
      System.out.println("Armstrong number"+sum);    
     else    
      System.out.println("not Armstrong"+sum);    
   }  
   }  
