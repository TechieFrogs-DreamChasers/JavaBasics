package Step2;

public class ArrayReplaceEle {
    public static void main(String[] args) {
        int []a={1,2,3};
        int oldValue=3;
        int newValue=30;
        int[] temp=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==oldValue){
                temp[index]=newValue;
                index++;
            }else{
                temp[index]=a[i];
                index++;
            }
            for(int t:temp){
                System.out.println(t);
            }
            
        }
    }
    
}
