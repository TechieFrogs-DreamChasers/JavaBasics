package Assignment3.Exercise7;

public class Counter {
        
    int i;

    Counter(int i){
        this.i = i;
    }

    void increment(){

        for(i=0;i<=3;i++)
        {
            if(i==3){
                System.out.println("i = "+ i);
            }
        }
    }
}
