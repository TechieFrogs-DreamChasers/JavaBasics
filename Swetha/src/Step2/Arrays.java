package Step2;

public class Arrays {
    public static void main(String[] args) {
      //  int a[]; // int[] a; //declaring Array
        int [] a ={10,20,30,40,50};//Aray Declaration andInitialisation
       // System.out.println(a.length);//To find Array size.

        /*Iterate Array in forward direction
for(int i=0;i<a.length;i++)
{
    System.out.println(a[i]);
}*/

/*Iterate Array in reverse direction
for(int i=a.length-1;i>=0;i--)
{
    System.out.println(a[i]);
}*/

//Iterating Array using enhanced for loop
for(int temp: a){
    System.out.println(temp);
}


    }

    public static void sort(int[] a) {
    }
    
}
