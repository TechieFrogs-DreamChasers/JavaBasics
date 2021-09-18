public class Squrear {
    int side;
    void area(){
        System.out.println("area is :" + side*side);
    }
    Squrear(int i){
        side=i;

    }
    public static void main(String[] args) {

        int arry[]={2,4,5,6,7,8,9,10,11,12};
        for(int i=0; i<arry.length;i++){
            Squrear oSqurear=new Squrear(arry[i]);
            oSqurear.area();

        }

    

    }
        
    }
    

