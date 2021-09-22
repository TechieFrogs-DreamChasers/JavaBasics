package AbstractClassAssignmt;

import java.util.Scanner;

public abstract class Marks {
    public abstract double getPercentage();
}

class StudentA extends Marks{
    int sub1,sub2,sub3;
    public double getPercentage(){
        double p = (sub1+sub2+sub3) /300.0;
        return p*100;
    }
    StudentA(int sub1,int sub2,int sub3){
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
}

class StudentB extends Marks{
    int sub1,sub2,sub3,sub4;
    public double getPercentage(){
        double p = (sub1+sub2+sub3+sub4)/400.0;
        return p*100;
    }

    StudentB(int sub1,int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
}

class MarksDemo{
    
    public static void main(String[] args){
        int sub1,sub2,sub3,sub4;
        System.out.println("Enter four marks");
        Scanner obj = new Scanner(System.in);
        sub1 = obj.nextInt();
        sub2 = obj.nextInt();
        sub3 = obj.nextInt();
        sub4 = obj.nextInt();
        obj.close();

        StudentA studentA = new StudentA(sub1,sub2,sub3);
        StudentB studentB = new StudentB(sub1,sub2,sub3,sub4);

        System.out.println(studentA.getPercentage()+ "%");
        System.out.println(studentB.getPercentage()+ "%");
    }
    
}
