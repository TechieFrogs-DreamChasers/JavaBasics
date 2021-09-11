public class Control{
    /*public static void main(String[] args) {
        int a = 2;
        int b = 4;

        if(a<b){
            System.out.println("True");
        }
        else{
                System.out.println("False");
                
        }
          
    }
    int num  = 60;

    if(num<=50){
        System.out.println("A");
    }
    else if(num>=70){
        System.out.println("B");
    }
    else if(num!=60){
        System.out.println("NO");
    }
    else{
        System.out.println("YES");
    }

    //nested if
    int a = 10;
    int   b = 20;
    if((++a<b && a>b) || (a++<=b)){
        System.out.println("TRUE");
    }
    if(a<b){
        System.out.println(2);
    }
    else if(a>b){
        System.out.println("S");
    }
    else{
        System.out.println(3);
    }
    public static void main(String[] args) {

    //Switch statement
    int num = 40;

    switch(num){
        case (10): System.out.println("A");
        break;
        case (20): System.out.println("B");
        break;
        case (30):System.out.println("C");
        break;
        case (40): System.out.println("DEAR");
        break;
        case (50): System.out.println("E");
        break;
        default: System.out.println("NILL");
    }
    
    int marks = 85;
    String status = "distinction";

    switch(status){
        case "fail", "pass"->System.out.println("F");
        
        case "credit", "distinction"->System.out.println("C");
    
        default->System.out.println("No result");
    }

    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            System.out.println(i);
        }
        for(int j=1;j<=4;j++){
            for(int k=1;k<=j;k++){
                System.out.print("*  ");
            }
            System.out.println();
            System.out.println();
            
        }
    }*/
    public static void main(String[] args) {
       /*a:
        for(int i=1; i<=3; i++){
            b:
            for(int j=1; j<=3; j++){
                if(i==2&&j==2){
                    break b;
                }
                System.out.println(i+"  "+j);
            }
        }*/
        int i=2;
        int j=1;
        while(i<=4){
            System.out.println(i);
            i++;

        }
        do{
            System.out.println("j="  +j);
            j++;
        }while(j<=10);
    }




}
   
