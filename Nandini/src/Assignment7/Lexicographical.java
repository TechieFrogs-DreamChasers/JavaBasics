package Assignment7;

public class Lexicographical {
        
    static void lexographicalOrder(String[] str){
        int i=0;
        int j=0;
        //str = new String[]{"String","abc","Tennis","Z","Basics"};

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

    static void display(String[] str){

        for(int k=0;k<str.length;k++){

            System.out.println(str[k]);   
        
        }
    }

    public static void main(String[] args) {

        String[] str = new String[]{"String","abc","Tennis","Z","Basics"};
        System.out.println("Before Lexographical order: ");
        display(str);
        System.out.println("After Lexographical order: ");
        lexographicalOrder(str);
        display(str);
        
    }


}
