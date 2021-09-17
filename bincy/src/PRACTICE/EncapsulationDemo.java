package PRACTICE;

public class EncapsulationDemo {
    public static void main(String[] args){
        Encpsule obj = new Encpsule();
        obj.setage(23);
        obj.setName("Dona");
        obj.setSalary(3500.0f);
        System.out.println(obj.getAge()+ " "+ obj.getName());
    }
   
     
}
