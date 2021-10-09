package Arrays8;

public class DuplicateElements {
    public static void main(String[] args) {
        /*char ch[] = {'a','b','w','a','f','b'};

        System.out.println("Duplicate Elements ");
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                   System.out.print(ch[j] + " ");
                }
            }
        }*/


        String[] str = {"Java","abc","Strong","abc","Java"};
        System.out.println("Duplicate Elements ");
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i] == str[j]){
                   System.out.print(str[j] + " ");
                }
            }
        }

    }    
}
