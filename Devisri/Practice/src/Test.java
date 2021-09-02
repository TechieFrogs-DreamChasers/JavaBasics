public class Test {
    public static void main(String[] args) {

        /*double d1 = Double.NaN;
        double d2 = d1;

        if(d1 == d2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");*/
        /*int i = 10;
        int j = 25;
        System.out.println(i + ' ' + j);//67
        int i = 010;
        System.out.println(i);//taking binary
        boolean b1 = true;
        boolean b2 = true;

        if(b1 == b2){
            System.out.print("==");
        }

        if(b1.equals(b2)){
            System.out.print("equals");
        }*/
        int a = 34;//34
        int b = 21;//21
        int c = a++ + ++b;//a=in this 34 after 35,b=22,c=56
        int d = --a + --b + c--;//a=34,b=21,c=56 after 55,d=111
        int e = a + +b + +c + d--;//a=34,b=21,c=55,d=111 after 110,e=221
        int f = -a + b-- + -c - d++;//a=-31,b=21 after 20,c=-55,d=110 after 111,f=-175
        int sum = a + b + c + d + e + f;//a=-31,b=20,c=-55,d=111,e=221,f=35
        System.out.println("sum = " + sum);//301
        int dailywage = 4;
        int number_of_days = 5;
        int salary = number_of_days++ * --dailywage * dailywage++ * number_of_days--;
        salary = -dailywage;
        System.out.println(dailywage + " " + number_of_days + " " + salary);
    }





}
