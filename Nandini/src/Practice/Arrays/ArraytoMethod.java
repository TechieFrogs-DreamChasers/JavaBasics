package Practice.Arrays;

//Array into Method
public class ArraytoMethod {
    public static void main(String[] args) {
        int a[] = {12,10,13,4};

        maximumValue(a);
    }

    static void maximumValue(int array[]){

        int max = array[0];

        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
    
}
