import java.util.Arrays;
import java.util.Scanner;

//Print an array
public class Program40 {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter an Integer Value: ");
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        char[][] chars = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Enter a character: ");
                chars[i][j] = sc.next().charAt(0);
                sc.nextLine();
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter the size:
10
Enter an Integer Value:
5
Enter an Integer Value:
10
Enter an Integer Value:
15
Enter an Integer Value:
20
Enter an Integer Value:
25
Enter an Integer Value:
30
Enter an Integer Value:
35
Enter an Integer Value:
40
Enter an Integer Value:
45
Enter an Integer Value:
50
[5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
Enter a character:
A
Enter a character:
B
Enter a character:
C
Enter a character:
D
Enter a character:
E
Enter a character:
F
Enter a character:
G
Enter a character:
H
Enter a character:
I
Enter a character:
J
Enter a character:
K
Enter a character:
L
Enter a character:
M
Enter a character:
N
Enter a character:
O
Enter a character:
P
Enter a character:
Q
Enter a character:
R
Enter a character:
S
Enter a character:
T
Enter a character:
U
Enter a character:
V
Enter a character:
W
Enter a character:
X
Enter a character:
Y
Enter a character:
Z
Enter a character:
a
Enter a character:
b
Enter a character:
c
Enter a character:
d
Enter a character:
e
Enter a character:
f
Enter a character:
g
Enter a character:
h
Enter a character:
i
Enter a character:
j
A B C D E F
G H I J K L
M N O P Q R
S T U V W X
Y Z a b c d
e f g h i j
 */