package Assignment7;

public class Lexicographical {

    static void lexographicalOrder(String str[]){
        int i=0;
        int j=0;

        for( i=0;i<str.length;i++){
            for(j=i+1;j<str.length;j++){

                if(str[i].compareToIgnoreCase(str[j])>0){

                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                }
               
            }
            
        }
    }

    public static void main(String[] args) {
        
    }
    
}
