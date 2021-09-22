package Step2;

public class ArrayMerge {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={4,5,6};
        int[] c=new int[a.length+b.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            c[index]=a[i];
            index++;
        }
        for(int j=0;j<b.length;j++){
            c[index]=b[j];
            index++;
        }
        for(int temp:c){
            System.out.println(temp);
        }
    
}
    
}
