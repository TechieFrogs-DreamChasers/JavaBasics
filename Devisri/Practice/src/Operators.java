public class Operators {
    static final String BIT_AND="Bitwise AND Checked";
    static final String BIT_AND_NOT="Bitwise AND notChecked";
    static final String BIT_OR="Bitwise OR Checked";
    static final String BIT_OR_NOT="Bitwise OR notChecked";
    static final String LOG_AND="Logical AND Checked";
    static final String LOG_AND_NOT="Logical AND notChecked";
    static final String LOG_OR="Logical OR Checked";
    static final String LOG_OR_NOT="Logical OR notChecked";
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        boolean isHigh=true;
        System.out.println(11F/4);
        //Using unary operator
        System.out.println("************ Unary operator Testing ************");
        //Increment Operator
        System.out.println(num1+ " " +num2);//10,5
        num1++;num2++;
        System.out.println(num1+ " " +num2);//11,6
        System.out.println(++num1+ " " +(++num2));//12,7
        System.out.println(num1+ " " +num2);//12,7
        System.out.println(num1+ " + " +num2 + " = " +(num1+num2));//12+7=19
        System.out.println(num1+ " + " +num2 + " = " +((num1++)+(num2++)));//12+7=19
        System.out.println(num1+ " + " +num2 + " = " +(num1+num2));//13+8=21
        System.out.println(num1+ " + " +num2 + " = " +((++num1)+(++num2)));//14+9=23
        //Decrement Operator
        System.out.println(num1+ " " +num2);//14,9
        num1--;num2--;
        System.out.println(num1+ " " +num2);//13,8
        System.out.println(--num1+ " " +(--num2));//12,7
        System.out.println(num1+ " + " +num2 + " = " +(num1-- - num2--));//12-7=5
        System.out.println(num1+ " + " +num2 + " = " +(num1-num2));//11-6=5
        System.out.println(num1+ " + " +num2 + " = " +(--num1 + --num2));//10+5=15
        System.out.println("******** Arithmetic Operators *******");
        System.out.println(num1+ " " +num2);//10,5
        System.out.println(num1 + num2);//15
        System.out.println(num1 - num2);//5
        System.out.println(num1 * num2);//50
        System.out.println(num1 / num2);//2
        System.out.println(num1 % num2);//0
        System.out.println("******** Bitwise complement & Negation Operators *******");
        System.out.println(~num1);//-11
        System.out.println(~num2);//-6
        System.out.println(!isHigh);//false
        System.out.println(isHigh);//true
        System.out.println("******** Shift Operators *******");
        System.out.println(num1+ " " +num2);//10,5
        System.out.println(num1<<num2);//10*2^5=320
        System.out.println(num1>>num2);//10/2^5=0
        System.out.println(num2<<num1);//5*2^10=5120
        System.out.println(num2>>num1);//5/2^10=0
        System.out.println("******** Bitwise & Logical AND/OR with comparison Ops *******");
        if((num1>num2) & (num2<num1)){
            System.out.println("True " +BIT_AND);//Prints this
        }else {
            System.out.println("False " +BIT_AND_NOT);
        }
        if((num1>num2) & (num2>num1)){
            System.out.println("True " +BIT_AND_NOT);
        }else {
            System.out.println("False " +BIT_AND);//Prints this
        }
        if((num1>num2) | (num2<num1)){
            System.out.println("True " +BIT_OR);//Prints this
        }else {
            System.out.println("False" +BIT_OR_NOT);
        }
        if((num1 < num2) | (num2 > num1)){
            System.out.println("True " +BIT_OR_NOT);
        }else {
            System.out.println("False " +BIT_OR);//Prints this
        }
        if((num1 > num2) && (num2 > num1)){
            System.out.println("True " +LOG_AND_NOT);
        }else {
            System.out.println("False " +LOG_AND);//Prints this
        }
        if((num1 < num2) && (num2 < num1)){
            System.out.println("True " +LOG_AND_NOT);
        }else {
            System.out.println("False " +LOG_AND);//Prints this
        }
        if((num1 > num2) || (num2 < num1)){
            System.out.println("True " +LOG_OR);//Prints this
        }else {
            System.out.println("False " +LOG_OR_NOT);
        }
        if((num1 < num2) || (num2 < num1)){
            System.out.println("True " +LOG_OR);//Prints this
        }else {
            System.out.println("False " +LOG_OR_NOT);
        }
        
    }
}
