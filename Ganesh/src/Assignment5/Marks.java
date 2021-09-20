package Assignment5;

public abstract class Marks {
    float Percentage;
    abstract float getPercentage();

    public static void main(String[] args) {
        A a = new A(85,95,75);
        a.getPercentage();
        B b = new B(82,86,57,98);
        b.getPercentage();
    }

}
class A extends Marks{
   
  A(float sub1,float sub2,float sub3){
    float Percentage = ((sub1+sub2+sub3)/300)*100;
          System.out.println("Percentage of student A :"+Percentage+"%");
  }
  float getPercentage(){
    return Percentage;
}
}


class B extends Marks{
    
    B(float sub1,float sub2,float sub3,float sub4){
        float Percentage = ((sub1+sub2+sub3+sub4)/400)*100;
        System.out.println("Percentage of student B :"+Percentage+"%");
    }
    float getPercentage(){
        return Percentage;
    }
    
}