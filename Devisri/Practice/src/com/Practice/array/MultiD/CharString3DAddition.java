package com.Practice.array.MultiD;
//Adding 3D+3D = 3D[3X3]
//char,String
//{ { { 1, 2, 3 }, { 4, 5, 6 } },  { { 1, 4, 9 }, { 16, 25, 36 } },
//                { { 1, 8, 27 }, { 64, 125, 216 } } }
public class CharString3DAddition {
    public static void main(String[] args) {
        char[][][] matA = {{{'a','b','c'},{'1','2','3'},{'d','e','f'}},
                {{'A','B','C'},{'4','5','6'},{'D','E','F'}},
                {{'1','2','3'},{'7','8','9'},{'g','h','i'}}};

        char[][][] matB = {{{'i','h','g'},{'9','8','7'},{'3','2','1'}},
                {{'F','E','D'},{'6','5','4'},{'C','B','A'}},
                {{'f','e','d'},{'3','2','1'},{'c','b','a'}}};

        char[][][] charsOf3X3X3 = new char[3][3][3];

        String[][][] mat1 = {{{"Ann","Bob","Cal"},{"Dev","Eva","Fam"},{"Gin","Han","Ire"}},
                {{"John","Kev","Len"},{"Mar","No","Op"},{"Pop","Nor","Rach"}},
                {{"Sam","Tom","Meg"},{"Van","Wil","Geor"},{"Zac","Sam","Tim"}}};

        String[][][] mat2 = {{{"ie","by","lie"},{"on","n","mie"},{"ni","na","ne"}},
                {{"ny","in","nie"},{"go","el","ie"},{"py","ma","el"}},
                {{"my","mie","han"},{"nessa","son","ge"},{"h","uel","my"}}};

        String[][][] stringsOf3X3X3 = new String[3][3][3];
        System.out.println("*************Char Addition:*************");
        System.out.println("Addition of 2 3D char Array[3][3][3]");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    charsOf3X3X3[i][j][k]=(char) (matA[i][j][k]+matB[i][j][k]);
                    System.out.print(charsOf3X3X3[i][j][k]+"  ");
                }
                System.out.println("  ");
            }
            System.out.println("  ");
        }
        System.out.println("*************String Addition/Concat:*************");
        System.out.println("Addition/Concat of 3 3D String Array[3][3][3]");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    stringsOf3X3X3[i][j][k] = mat1[i][j][k]+mat2[i][j][k];
                    System.out.print(stringsOf3X3X3[i][j][k]+" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
/*
Output:
*************Char Addition:*************
Addition of 2 3D char Array[3][3][3]
Ê  Ê  Ê
j  j  j
    

    
j  j  j
    

    
j  j  j
Ê  Ê  Ê

*************String Addition/Concat:*************
Addition/Concat of 3 3D String Array[3][3][3]
Annie Bobby Callie
Devon Evan Fammie
Ginni Hanna Irene

Johnny Kevin Lennie
Margo Noel Opie
Poppy Norma Rachel

Sammy Tommie Meghan
Vannessa Wilson George
Zach Samuel Timmy
 */
