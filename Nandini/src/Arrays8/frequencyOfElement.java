package Arrays8;

public class frequencyOfElement {
    public static void main(String[] args) {
        
        char[] ch = {'c','a','e','c','a','k','l','k'};

        int chr[] = new int[ch.length];
        int count,i,j;   
        int visited = -1;     

        for(i=0;i<ch.length;i++){
            count = 1;
            for(j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                    chr[j] = visited;
                }    
            }
            if(chr[i]!=visited){
                chr[i] = count;
            }
        }

        for(int k=0;k<chr.length;k++){
            if(chr[k]!=visited)
            System.out.println("Frequency is  " + ch[k] +"--" + chr[k]);
        }
    }
    
}
