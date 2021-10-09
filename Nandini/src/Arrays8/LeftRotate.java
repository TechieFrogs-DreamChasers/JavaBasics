package Arrays8;

public class LeftRotate {
    public static void main(String[] args) {
        int[] number = {1,3,6,4,2,5,6};

        //number of times an array should rorate
        int num = 1,i,j;

        System.out.println("Before Rotating ");
        for(i=0;i<number.length;i++){
            System.out.print(number[i] +" ");
        }

        for(i=0;i<num;i++){
            int first = number[0];
            for(j=0;j<number.length-1;j++){
                number[j] = number[j+1];
            }
            number[j] = first;
        }
        
    
        System.out.println();
        System.out.println("After Rotating ");
        for(i=0;i<number.length;i++){
        System.out.print(number[i]+ " ");
        }
    }
    
}
