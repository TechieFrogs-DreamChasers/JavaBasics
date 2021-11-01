//Find The Percentage Of Uppercase Letters,
// Lowercase Letters, Digits And Other Special Characters In A String
public class Program6 {
    public static void main(String[] args) {
        String string = "Blue Berries are Blue Color and there are a Total Of 2000 Berries Here!!!.";
        findPercentage(string);
    }

    static void findPercentage(String s) {
        int l_count = 0;
        int u_count = 0;
        int n_count = 0;
        int s_count = 0;
        int total = s.length();
        for (int i = 0; i < total; i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                l_count++;
            } else if (Character.isUpperCase(ch)) {
                u_count++;
            } else if (Character.isDigit(ch)) {
                n_count++;
            } else {
                s_count++;
            }
        }
        double l_Percent = (double) (l_count * 100) / total;
        double u_Percent = (double) (u_count * 100) / total;
        double n_Percent = (double) (n_count * 100) / total;
        double s_Percent = (double) (s_count * 100) / total;
        System.out.println("String: " + s);
        System.out.println("Percentage of Lowercase: " + String.format("%.4f", l_Percent) + "%.");
        System.out.println("Percentage of Uppercase: " + String.format("%.4f", u_Percent) + "%.");
        System.out.println("Percentage of Digits: " + String.format("%.4f", n_Percent) + "%.");
        System.out.println("Percentage of SpecialChars: " + String.format("%.4f", s_Percent) + "%.");
    }
}
/*
String: Blue Berries are Blue Color and there are a Total Of 2000 Berries Here!!!.
Percentage of Lowercase: 60.8108%.
Percentage of Uppercase: 10.8108%.
Percentage of Digits: 5.4054%.
Percentage of SpecialChars: 22.9730%.
 */