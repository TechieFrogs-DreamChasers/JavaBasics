package Practice.Arrays;

public class AnnonymousArray {

    public static void main(String[] args) {
        
        annonymous(new int[]{2,5,8,9});
    }

    static void annonymous(int array[]){

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
