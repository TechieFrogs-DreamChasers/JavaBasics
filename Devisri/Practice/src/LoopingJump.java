public class LoopingJump {
    public static void main(String[] args) {
        /*int i=0;
        loop1:while(i<=100){
            if(i==10){
                System.out.println("Value Of "+i+" checked.");
                break loop1;
            }
            i++;
          System.out.println(i);
        }
        System.out.println("Out of loop1");*/
        loop1:for (int i=1;i<=5;i++){
             if(i==3){
                break loop1;}
             loop2:for (int j=5;j>=1;j--){
                    if(j==3){
                        break loop2;
                    }
                loop3:for(int k=1;k<=5;k++){
                    System.out.println(i+" \t"+j+" \t"+k);
                     if(k==3)
                        continue loop3;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
