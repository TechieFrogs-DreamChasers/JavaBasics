package PRACTICE.Operators;
//Increment decrement
public class PrefixPostfix {
    public static void main(String[] args){
        int i = 4;
        int a=0;
        i++;
        System.out.println(i);//5
        ++i;
        System.out.println(i);//6
        i=+1;
        System.out.println(i);//1
        i+=1;
        System.out.println(i);//2
        System.out.println(i++ + ++a);//2+1=3
        System.out.println(i++ + a++);//3+1=4
        System.out.println(i++ + i++);//4+5, i=6
        System.out.println(++i + i++);//7+7, i=8
        System.out.println(++i + ++i);//9+10, i=10
        a=5;
        i=5;
        System.out.println(a<=i & i++ <=a);//true
    }
}
