package Arrays8;

public class ContainsGivenValue {
    public static void main(String[] args) {
        
        int number[] = {12,27,29,10,37};
        int toFind = 12;
        boolean found = false;

        for(int i:number){
            if(i == toFind)
            {
                found = true;
                break;
            }
        }

        //boolean found = IntStream.of(num).anyMatch(n -> n == toFind); [for Integer value] instead of for loop

        //boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind)); 

        if(found)
        System.out.println("Given Value is found");
        else
        System.out.println("Given Value not found ");

    }
    
}
