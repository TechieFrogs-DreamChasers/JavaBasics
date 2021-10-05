package com.Practice.array.MultiD;
//Adding 2D+2D = 2D[3X3]
//Adding 2D+2D+2D= 2D[3X3X3]
//char,String
public class CharSTringMatrixAddition {
    public static void main(String[] args) {
        char[][] matA = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}};
        char[][] matB = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        char[][] matC = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        char[][] charsOf3X3 = new char[3][3];
        System.out.println("*************Char Addition:*************");
        System.out.println("Addition of 2 2D char Array[3][3]");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                charsOf3X3[i][j] = (char) (matA[i][j] + matB[i][j]);
                System.out.print(charsOf3X3[i][j] + "  ");
            }
            System.out.println("  ");
        }
        System.out.println("Addition of 3 2D char Array[3][3]");
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                charsOf3X3[i][j] = (char) (matA[i][j] + matB[i][j] + matC[i][j]);
                System.out.print(charsOf3X3[i][j] + "  ");
            }
            System.out.println("  ");
        }

        System.out.println("*************String Addition/Concat:*************");

        String[][] mat1 = {{"Mr.", "Mr.", "Mr."}, {"Mrs.", "Mrs.", "Mrs."}, {"Ms.", "Ms.", "Ms."}};
        String[][] mat2 = {{"John ", "Will ", "Tom "}, {"Sam ", "Anne ", "Jen "}, {"Ava ", "Emma ", "Mia "}};
        String[][] mat3 = {{"Wilson", "Smith", "Hardy"}, {"Wilson", "Smith", "Hardy"}, {"Shaw", "Thompson", "White"}};
        String[][] stringsOf3X3 = new String[3][3];
        System.out.println("Addition/Concat of 2 2D String Array[3][3]");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                stringsOf3X3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(stringsOf3X3[i][j] + "  ");
            }
            System.out.println("  ");
        }
        System.out.println("Addition/Concat of 3 2D String Array[3][3]");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                stringsOf3X3[i][j] = mat1[i][j] + mat2[i][j] + mat3[i][j];
                System.out.print(stringsOf3X3[i][j] + "  ");
            }
            System.out.println("  ");
        }
    }
}
/*
Output:
*************Char Addition:*************
Addition of 2 2D char Array[3][3]
¢  ¤  ¦
¨  ª  ¬
®  °  ²
Addition of 3 2D char Array[3][3]
Ó  Ö  Ù
Ü  ß  â
å  è  ë
*************String Addition/Concat:*************
Addition/Concat of 2 2D String Array[3][3]
Mr.John   Mr.Will   Mr.Tom
Mrs.Sam   Mrs.Anne   Mrs.Jen
Ms.Ava   Ms.Emma   Ms.Mia
Addition/Concat of 3 2D String Array[3][3]
Mr.John Wilson  Mr.Will Smith  Mr.Tom Hardy
Mrs.Sam Wilson  Mrs.Anne Smith  Mrs.Jen Hardy
Ms.Ava Shaw  Ms.Emma Thompson  Ms.Mia White
 */
