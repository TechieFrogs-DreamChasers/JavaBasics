public class NewSwitch {
    public static final String MSG1="It's very cool";
    public static final String MSG2="It's Moderately cool";
    public static final String MSG3="It's not that cool";
    public static final String ERR_MSG="Entered Invalid Value";

    public static void main(String[] args) {
        int temp=0;
        switch(temp){
            case 16,17,18-> System.out.println(MSG1);
            case 19,20,21,22,23,24-> System.out.println(MSG2);
            case 25,26,28-> System.out.println(MSG3);
            default-> System.out.println(ERR_MSG);
        }
        System.out.println("******************");
        String day = "Thursday";
        int option=switch(day){
            case "Monday","Friday","Sunday"-> 17;
            case "Wednesday","Tuesday"-> 22;
            case "Saturday"->27;
            default -> 21;
        };
        System.out.println(option);
        System.out.println("******************");
        String temp1="Thursday";
        String day1= switch(temp1){
            case "Monday","Friday","Sunday"-> "A Very Cold Day";
            case "Wednesday","Tuesday"-> "Cold Day";
            case "Saturday"->"Hot Day";
            default -> "Good Day";
        };
        System.out.println(day1);
 }
}
