public class Student {
    int roll_no = 2;
    String name;
    public static void main(String[] args) {
        
        Student stu = new Student();
        stu.name = "John";
        stu.roll_no=2;
        System.out.println("Roll number        Name");
        System.out.println(stu.roll_no+ "                  "+stu.name);

    }
}

        /*static String name ="JOhn";
        static int rollno=2;
        public static void main(String args[]) {
        System.out.println("Name : "+ name);
        System.out.println("Rollno: " + rollno);
        }
    }*/
