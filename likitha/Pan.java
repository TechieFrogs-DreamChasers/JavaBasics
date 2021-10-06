import java.util.*;  
public class Pan  
{  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the base of the number: ");  
int base = sc.nextInt();  
System.out.print("Enter the number: ");  
String number = sc.next();  
if (isPandigital(base, number))  
System.out.println("The given number is a pandigital number.");  
else  
System.out.println("The given number is a not a pandigital number.");  
}      
//function that checks if the number is pandigital or not  
static boolean isPandigital(int base, String number)   
{     
//checks if the length is less than base or not  
if (number.length() < base)  
//returns false if length is greater than base  
return false;  
//creates a boolean array of size base  
boolean array[] = new boolean[base];  
//assigns the specified data type (false) value to each element   
Arrays.fill(array, false);  
//the loop iterates over the given number  
for (int i = 0; i < number.length(); i++)   
{         
//executes if the given number has digits  
if (number.charAt(i) >= '0' && number.charAt(i) <= '9')array[number.charAt(i) - '0'] = true;  
//executes if the given number is alphabet  
else if (number.charAt(i) - 'A' <= base - 11)array[number.charAt(i) - 'A' + 10] = true;  
}  
//checks if any index is unmarked or not  
for (int i = 0; i < base; i++)  
if (array[i] == false)  
return false;  
return true;  
}  
}