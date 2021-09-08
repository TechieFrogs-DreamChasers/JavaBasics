public class ComplexNumbers {
    //Step1->defining two variables(One for real part and the other for imaginary
    double real;
    double img;
    //Step2->Using parameter constructor to initialize values
    public ComplexNumbers(double real, double img) {
        this.real = real;
        this.img = img;
    }
    //Step6
    public static void main(String[] args) {
        ComplexNumbers c1=new ComplexNumbers(2.5,3.5);
        ComplexNumbers c2=new ComplexNumbers(4.5,5.5);
        ComplexNumbers add= sum(c1,c2);
        System.out.println("The Addition of two Complex Numbers: "+add.real+" + "+add.img+"i");
        ComplexNumbers diff=difference(c1,c2);
        System.out.println("The Subtraction of two Complex Numbers: "+diff.real+" + "+diff.img+"i");
        ComplexNumbers mul=multiply(c1,c2);
        System.out.println("The Product of two Complex Numbers: "+mul.real+" + "+mul.img+"i");

    }
    //Step3->For adding Complex Number we need a method to perform the addition part.
    //Every class is a primitive data type. We are returning class type value.
    //now sum(num1,num2) our method with datatype/return type as class ComplexNumbers
    static ComplexNumbers sum(ComplexNumbers num1,ComplexNumbers num2){
        //here we created a variable temp for our class.
        //passing 0,0 to our parameter constructor
        //using variable we are accessing real instance variable & instance variable
        ComplexNumbers temp= new ComplexNumbers(0,0);
        temp.real=num1.real + num2.real;//adding real part
        temp.img=num1.img + num2.img;//adding img part
        return temp;//stored result in temp is returned
    }
    //Step4->For subtracting Complex Number we need a method to perform the Subtraction part.
    static ComplexNumbers difference(ComplexNumbers num1,ComplexNumbers num2){
        ComplexNumbers temp=new ComplexNumbers(0,0);
        temp.real= num1.real - num2.real;//subtracting real part
        temp.img= num1.img - num2.img;//subtracting img part
        return temp;
    }
    //Step5->For multiplication of Complex Number we need a method to perform the multiply part.
    static ComplexNumbers multiply(ComplexNumbers num1,ComplexNumbers num2){
        ComplexNumbers temp=new ComplexNumbers(0,0);
        temp.real= num1.real * num2.real;//multiplying real part
        temp.img= num1.img * num2.img;//multiplying img part
        return temp;
    }
}
