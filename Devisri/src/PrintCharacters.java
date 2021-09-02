public class PrintCharacters {
    public static void main(String[] args) {
        for (char ch ='a';ch<='z';ch++){
            System.out.print(ch+"\t");
            System.out.println(Character.toUpperCase(ch)+"\t");
        }
    }
}
