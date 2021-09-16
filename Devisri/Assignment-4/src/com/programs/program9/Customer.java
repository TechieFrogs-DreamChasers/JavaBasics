package com.programs.program9;

public class Customer {
    private String cust_Name;
    private int cust_Id;
    private long cust_Phone;
    private String cust_Email;

    public Customer(String cust_Name, int cust_Id, long cust_Phone, String cust_Email) {
        this.cust_Name = cust_Name;
        this.cust_Id = cust_Id;
        this.cust_Phone = cust_Phone;
        this.cust_Email = cust_Email;
    }

    public String getCust_Name() {
        return cust_Name;
    }

    public int getCust_Id() {
        return cust_Id;
    }

    public long getCust_Phone() {
        return cust_Phone;
    }

    public String getCust_Email() {
        return cust_Email;
    }
    public void cust_Details(){
        System.out.println(getCust_Name()+"  "+getCust_Id()+"  "+getCust_Email()+"  "+getCust_Phone());
    }
}
