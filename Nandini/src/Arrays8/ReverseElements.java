package Arrays8;

public class ReverseElements {
    public static void main(String[] args) {
        
        String[] str = {"Java","Program","Devo"};
        
        System.out.println("Before Reverse ");
        for(int i=0;i<str.length;i++)
        System.out.print(str[i]+ " ");

        System.out.println();
        System.out.println("Reverse Order ");
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str[i]+ " ");
        }
    }
}
