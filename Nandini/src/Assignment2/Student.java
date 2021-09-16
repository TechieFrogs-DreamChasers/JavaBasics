<<<<<<< HEAD

=======
package Assignment2;
>>>>>>> 4925dc6a6839deb37f9dc0a89ebbec9612ad9f4c
public class Student {
    String name;
    int roll_num;
    String phone_num;
    String address;
    
    public static void main(String[] args) {
    	
        Student s = new Student("Jhon",2);
        s.information();
    }

    public Student(String name, int roll_num,String phone_num,String address) {
        this.name = name;
        this.roll_num = roll_num;
        this.phone_num = phone_num;
        this.address = address;
    }
    
    public Student(String name,int roll_num) {
    	this.name = name;
        this.roll_num = roll_num;
    }

    
    void information(){
        System.out.println(name+" "+roll_num);
    }
    
    void studentDetails() {
		
		System.out.println("Name: "+ name +"; "+ "Roll Num: " + roll_num+ "; " +"PhoneNumber: "+  phone_num +"; "+ "Address: "+ address);
	}
}


