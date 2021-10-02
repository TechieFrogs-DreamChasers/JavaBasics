package Assignment7;


public class StringNEqualParts {

    public static void main(String[] args) {
        
        String str = "JavaBasicser";
        int length = str.length();
        int n = 3;
        String[] string = new String[n];
        
        nequalParts(length, n, str,string);

    }

    static void nequalParts(int length,int n,String str,String[] string){
         
        int j = 0;
        int numOfChars = (length/n);
        

        if(length % n != 0){
            System.out.println("We cannot divide the string into "+ n +"equal parts ");
        }else{
            for(int i=0;i<length;i+=numOfChars){

                String subString = str.substring(i, i+numOfChars);
                string[j] = subString;
                j++;
            }
        }

        
    }

    static void display(String[] string,int n){

        System.out.println(n + "Equal Parts of the String is: ");
        for(int k=0;k<string.length;k++){

            System.out.println(string[k]);
        }

        
            
    }
    
    
}
