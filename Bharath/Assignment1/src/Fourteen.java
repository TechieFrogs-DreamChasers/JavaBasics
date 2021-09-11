public class Fourteen {
    public static void main(String[] args) {
        int p = 27;
        int j = 0;
        for(int  i = 1;i <= p;i++){
            if(p%i == 0){
                j = j+i;
            }                      
        }
        if(j == p+1){
            System.out.println("IS PRIME NUMBER");
            }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    
}
