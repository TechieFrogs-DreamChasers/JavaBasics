public class String1{

    public static void Count(String str)

    {
        String ss = str.toLowerCase();
        char[] charec = ss.toCharArray();

        int vow=0,dig = 0, cons = 0 ,space = 0;

        for(int i=0; i <charec.length;i++)
        {
           char c= charec[i];
           switch (c) {
               case 'a','e','i','o','u':
                    vow ++;                 
                   break;
                case ' ' :
                    space++;
                    break;
                case '1','2','3','4','5','6','7','8','9','0':
                    dig++;
                    break;
                default:
                    cons++;
                   break;
           }
           
        }
        System.out.println("digits count "+dig);
           System.out.println("Vowels count"+vow);
           System.out.println("cons count "+cons);
           System.out.println("spaces count "+space);
    }


    public static void main(String[] args) {
        String s = new String("Good Morning My Love123");
        Count(s);


    }


}