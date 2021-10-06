package ArraysAssignment;
//copy all elements in an array into another
public class Progrm1 {
    public static void main(String []args){
        int num1[] = new int []{2,4,5,6,3,6};
        int num2[] =new int[num1.length];
        for(int i=0;i<num1.length;i++){
            num2[i] = num1[i];
        }
        System.out.println("Elements of original array: ");
        for(int i=0;i<num1.length;i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println("");
        System.out.println("Elements of copied array");
        for(int j=0;j<num2.length;j++){
            System.out.print(num2[j]+ " ");
        }
    }
    
    
          
}
