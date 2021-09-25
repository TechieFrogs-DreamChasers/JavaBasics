package Abtraction;



public abstract class Marks {

    abstract float getpercentage();

    
}
class studentA extends Marks{
    int sub1;
    int sub2;
    int sub3;
    

    @Override
    float getpercentage() {
        int sum= sub1+sub2+sub3;
        float  per = sum/300f;
        return(per*100);
        
    }
    studentA(int newsub1,int newsub2,int newsub3){
        this.sub1=newsub1;
        this.sub2=newsub2;
        this.sub3=newsub3;

         
    }
}
class studentB extends Marks{
    int sub1;
    int sub2;
    int sub3;
    int sub4;
       float getpercentage(){
           float per= (sub1+sub2+sub3+sub4)/400f;
          return(per*100);
        
    }
    studentB( int newsub1,int newsub2,int newsub3,int newsub4){
        this.sub1=newsub1;
        this.sub2=newsub2;
        this.sub3=newsub3;
        this.sub4=newsub4;

    }
    public static void main(String[] args) {
        studentA oA=new studentA(70, 60, 50);
       
        System.out.println( oA.getpercentage());
        
    }
}
