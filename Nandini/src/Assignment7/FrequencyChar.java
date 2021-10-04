package Assignment7;

public class FrequencyChar {

    public static void main(String[] args) {
        String string ="Developers Develope ";

        int count[] = new int[string.length()];

        char ch[] = string.toCharArray();

        int i,j;
        for(i=0;i<string.length();i++){
            count[i] = 1;
            for(j=i+1;j<string.length();j++){
                if(ch[i] == ch[j]){
                    count[i]++;
                    ch[j] = '0';
                }
            }
        }

        for(i=0;i<count.length;i++){
            if(ch[i] != '0' && ch[i] != ' ')
            System.out.println("Frequency of Character : " + ch[i] + " is " + count[i]);
        }
    }
    
}
