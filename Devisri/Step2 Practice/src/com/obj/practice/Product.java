package com.obj.practice;

public class Product implements Cloneable {
    int product_Id;
    String product_Name;
    double product_Cost;
    int product_Release_Year;
    Address address;

    public Product() {
    }

    public Product(int product_Id, String product_Name, double product_Cost, int product_Release_Year, Address address) {
        this.product_Id = product_Id;
        this.product_Name = product_Name;
        this.product_Cost = product_Cost;
        this.product_Release_Year = product_Release_Year;
        this.address = address;
    }

    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public double getProduct_Cost() {
        return product_Cost;
    }

    public void setProduct_Cost(double product_Cost) {
        this.product_Cost = product_Cost;
    }

    public int getProduct_Release_Year() {
        return product_Release_Year;
    }

    public void setProduct_Release_Year(int product_Release_Year) {
        this.product_Release_Year = product_Release_Year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return product_Id + "\t" + product_Name + "\t" + product_Cost +
                "\t" + product_Release_Year + "\n" + address;
    }

    public Object clone() throws CloneNotSupportedException {
        Product product = (Product) super.clone();
        Address address = (Address) product.getAddress().clone();
        product.setAddress(address);
        return product;
    }
}
