package Arrays8;

public class RightRotate {
    public static void main(String[] args) {
        
        int[] n = {2,1,3,5,6,8,7};
        int number = 3,i,j;

        System.out.println("Before Right Rotation ");
        for(i=0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }

        for(i=0;i<number;i++){
            int last = n[n.length-1];
            for(j=n.length-1;j>0;j--){
                n[j] = n[j-1];
            }
            n[0] = last;
        }
        System.out.println();
        System.out.println("After Right Rotation ");
        for(i=0;i<n.length;i++)
        System.out.print(n[i]+" ");
    }
    
}
