package com.obj.practice;

public class ProductAddressFunctionality {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add1 = new Address(25, "Hyderabad", "Telangana", "India", 500000);
        Product pro1 = new Product(95281, "Laptop Charger", 2600.0, 2018, add1);
        System.out.println("Original: " + pro1);
        Product pro2 = (Product) (pro1.clone());
        System.out.println("Replica: " + pro2);
        System.out.println("Hashcode Product Original: " + pro1.hashCode() + "\t Product Replica: " + pro2.hashCode());
        Address add2 = (Address) add1.clone();
        System.out.println("Hashcode Address Original: " + add1.hashCode() + "\t Address Replica: " + add2.hashCode());
        //Hashcode Address Ref Original: 1323165413	 Address Ref Replica: 1323165413
        // (Before manual code output is same for both)
        //System.out.println("Hashcode Address Ref Original: "+pro1.getAddress().hashCode()+"\t Address Ref Replica: "+pro2.getAddress().hashCode());
        //After manual code output hashcode is not same
        //Hashcode Address Ref Original: 1323165413	 Address Ref Replica: 511754216
        System.out.println("Hashcode Address Ref Original: " + pro1.getAddress().hashCode() + "\t Address Ref Replica: " + pro2.getAddress().hashCode());

    }
}
