public class Account {
    String name;
    double limit;
    String email;

    public Account() {
        this("Jenny",100000.0,"jenny@email.com");
    }

    public Account(String name, String email) {
        this(name,100000,email);
        //this.name = name;
        //this.email = email;
    }

    public Account(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public static void main(String[] args) {
        Account jenny=new Account();
        jenny.display();
        Account kim=new Account("Kim","kim@email.com");
        kim.display();
        Account tim=new Account("Tim",100000,"tim@email.com");
        tim.display();
    }
    void display(){
        System.out.println(name+" "+limit+" "+email);
    }
}
