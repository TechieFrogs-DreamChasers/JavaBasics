package TCSNQT.Program2;

public class Trainee3 implements MPCS {

    int round1;
    int round2;
    int round3;
    int[] threeRounds = {round1,round2,round3};
    
    Trainee3(){
        
    }

    Trainee3(int r1,int r2,int r3){
        this.round1 = r1;
        this.round2 = r2;
        this.round3 = r3;
    }

    int getround1(){
        return round1;
    }

    int getround2(){
        return round2;
    }

    int getround3(){
        return round3;
    }

    @Override
    public int getAverage() {
       
        return ((round1+round2+round3)/3);
    }
    
}
