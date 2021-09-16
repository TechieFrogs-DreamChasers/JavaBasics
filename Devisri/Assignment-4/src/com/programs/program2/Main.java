package com.programs.program2;

/*
Output:
10    B   76
F    100   170
 */
public class Main {
    public static void main(String[] args) {
        PrintOverload po = new PrintOverload();
        po.print(10, 'B');
        po.print('F', 100);
    }
}
