package com.programs.program4;

/*
Output:
Ann | 18 | CA
Ben | 19 | DC
Cal | 22 | LA
Dev | 21 | NY
Tom | 23 | NJ
Sam | 19 | SF
Tim | 20 | DC
Han | 21 | CA
Ian | 20 | LA
Jim | 18 | NY
 */
public class Main {
    public static void main(String[] args) {
        Student std = new Student();

        String[] name = new String[]
                {"Ann", "Ben", "Cal", "Dev", "Tom", "Sam", "Tim", "Han", "Ian", "Jim"};
        int[] age = new int[]
                {18, 19, 22, 21, 23, 19, 20, 21, 20, 18};
        String[] address = new String[]
                {"CA", "DC", "LA", "NY", "NJ", "SF", "DC", "CA", "LA", "NY"};
        for (int i = 0; i < name.length; i++) {
            std.setInfo(name[i], age[i], address[i]);
        }
    }
}
