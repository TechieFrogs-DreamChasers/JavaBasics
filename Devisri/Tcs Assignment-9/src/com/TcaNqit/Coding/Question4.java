package com.TcaNqit.Coding;

import java.util.Scanner;

//The Caesar cipher is a type of substitution cipher
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Read the Message: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println("Read the key: ");
        int key = sc.nextInt();
        sc.nextLine();
        sc.close();
        customCeaserCipher(key, message);
    }

    static void customCeaserCipher(int key, String message) {
        //To append the decrypted message
        String text = "";
        //Taking an empty character to concatenate new character to string
        char ch = ' ';
        //key < 0 condition checked
        if (key < 0) {
            System.out.println("INVALID INPUT");
        }
        //key > 0
        else {
            //traversing through message length
            for (int i = 0; i < message.length(); i++) {
                //storing char at every iteration
                char c = message.charAt(i);
                //A-Z
                if (c >= 65 && c <= 90) {
                    ch = (char) ((c + key - 65) % 26 + 65);
                }
                //a-z
                else if (c >= 97 && c <= 122) {
                    ch = (char) ((c + key - 97) % 26 + 97);
                }
                //0-9
                else if (c >= 48 && c <= 57) {
                    ch = (char) ((c + key - 48) % 10 + 48);
                }
                //remaining chars(any) condition checked
                else {
                    ch = c;
                }
                //Appending these characters to String text
                text += ch;
            }
            System.out.println("Decrypted Message: " + text);
        }

    }
}
/*
Read the Message:
All the best
Read the key:
1
Decrypted Message: Bmm uif cftu
*/
