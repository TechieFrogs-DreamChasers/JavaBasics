package Assignment3.Exercise8;

public class ClassB extends ClassA{
    
    int k;
    ClassB(int k){
        super(14,67);
        this.k = k;   
    }

    @Override
    void show(){
        System.out.println("The Value of k is: " + k);
    }
}
