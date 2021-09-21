public class Scquence { 
    void print(int i,char a ){
        System.out.println(i+","+a);
    }
    void print( char b,int j){
        System.out.println(b+","+j);
    }
    public static void main(String[] args) {
        Scquence oScquence=new Scquence();
        oScquence.print('B', 10);
    }
    
}
