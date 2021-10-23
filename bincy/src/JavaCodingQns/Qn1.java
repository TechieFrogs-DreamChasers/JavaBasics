package JavaCodingQns;
//Intersection of two arrays
public class Qn1 {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int b[]={3,4,5,6,7};
        int c[];
        if(a.length>b.length){
            c = new int[a.length];
        }
        else{
            c=new int[b.length];
        }
        
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j =0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[k] = a[i];
                    k++;

                }
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(c[i]);
        }
        
    }
}
