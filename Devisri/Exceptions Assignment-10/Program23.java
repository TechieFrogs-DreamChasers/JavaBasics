import java.util.Arrays;

//Illustrate try,catch and finally block
public class Program23 {
    public static void main(String[] args) {
        String[] employee_Name = {"Phoebe", "Claire", "Fiona", "Hayley", "Anne", "Ella", "Meg", "Joanne", null, "Shay"};
        int[] employee_Id = {101, 102, 103, 104, 105, 106, 107, 108, 109, 0};
        int[] employee_salary = {1000, 5000, 4000, 8000, 6000, 1500, 900, 10000, 12000, 5000};
        System.out.println("Employee List: ");
        System.out.println("Emp_Name:" + "\t" + "Id:" + "\t\t" + "Salary: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(employee_Name[i] + " \t\t " + employee_Id[i] + " \t " + employee_salary[i]);
        }
        System.out.println(" ");
        try {
            System.out.println("Employee Name:");
            for (int i = 0; i < employee_Name.length; i++) {
                if (employee_Name[i] == null) {
                    System.out.println("Name is " + null + " at index: " + (i + 1));
                    throw new NullPointerException("INVALID NAME. NAME SHOULD NOT BE NULL!!!");
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            for (int i = 0; i < employee_Name.length; i++) {
                if (employee_Name[i] == null) {
                    employee_Name[i] = "Irene";
                }
            }
        } finally {
            System.out.println("Employee Name List: \n" + Arrays.toString(employee_Name));
        }
        System.out.println(" ");
        try {
            System.out.println("Employee Id:");
            for (int i = 0; i < employee_Id.length; i++) {
                if (employee_Id[i] == 0) {
                    System.out.println("Id is " + 0 + " at index: " + (i + 1));
                    throw new ArithmeticException("EMPLOYEE ID SHOULD NOT BE ZERO!!!");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            for (int i = 0; i < employee_Id.length; i++) {
                if (employee_Id[i] == 0) {
                    employee_Id[i] = 110;
                }
            }
        } finally {
            System.out.println("Employee Id List: \n" + Arrays.toString(employee_Id));
        }
        System.out.println(" ");
        try {
            System.out.println("Employee Salary:");
            for (int i = 0; i < employee_salary.length; i++) {
                if (employee_salary[i] < 1000) {
                    System.out.println("Salary is < 1000 at index: " + (i + 1));
                    throw new ArithmeticException("SALARY LIMIT IS INVALID!!!");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            for (int i = 0; i < employee_salary.length; i++) {
                if (employee_salary[i] < 1000) {
                    employee_salary[i] = 1000;
                }
            }
        } finally {
            System.out.println("Employee Salary List: \n" + Arrays.toString(employee_salary));
        }
        System.out.println("Modified Employee List: ");
        System.out.println("Emp_Name:" + "\t" + " Id: " + "\t" + "Salary: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(employee_Name[i] + " \t\t " + employee_Id[i] + " \t " + employee_salary[i]);
        }
    }
}
/*
Employee List:
Emp_Name:	Id:		Salary:
Phoebe 		 101 	 1000
Claire 		 102 	 5000
Fiona 		 103 	 4000
Hayley 		 104 	 8000
Anne 		 105 	 6000
Ella 		 106 	 1500
Meg 		 107 	 900
Joanne 		 108 	 10000
null 		 109 	 12000
Shay 		 0 	 5000

Employee Name:
Name is null at index: 9
INVALID NAME. NAME SHOULD NOT BE NULL!!!
Employee Name List:
[Phoebe, Claire, Fiona, Hayley, Anne, Ella, Meg, Joanne, Irene, Shay]

Employee Id:
Id is 0 at index: 10
EMPLOYEE ID SHOULD NOT BE ZERO!!!
Employee Id List:
[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

Employee Salary:
Salary is < 1000 at index: 7
SALARY LIMIT IS INVALID!!!
Employee Salary List:
[1000, 5000, 4000, 8000, 6000, 1500, 1000, 10000, 12000, 5000]
Modified Employee List:
Emp_Name:	 Id: 	Salary:
Phoebe 		 101 	 1000
Claire 		 102 	 5000
Fiona 		 103 	 4000
Hayley 		 104 	 8000
Anne 		 105 	 6000
Ella 		 106 	 1500
Meg 		 107 	 1000
Joanne 		 108 	 10000
Irene 		 109 	 12000
Shay 		 110 	 5000
 */