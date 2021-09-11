public class Operators {
    public static void main(String[] args) {
        int i = 2;
        int j= 4;


        System.out.println(i>j && ++i<j);//false
        System.out.println(i);//2
        System.out.println(i<j && j++ >i);//true
        System.out.println(j);//5
        System.out.println(i>j & i++<j);//false
        System.out.println(i);//3   

        System.out.println(i<j || ++i<j);//true
        System.out.println(i);//3
        System.out.println(i<j|| j++>i);//true
        System.out.println(j);//5
        System.out.println(i<j | ++j<i);//true
        System.out.println(j);//6
    }
}
