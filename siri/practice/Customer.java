public class Customer extends Account1{ 
     String name;
     double phonenumber;
     String emailid;
     double acc_num;
     void print(){
         System.out.println(name +" , "+phonenumber);

     }
     Customer(String newname,double newphonenumber,String newemailid,double newacc_num){
         this.name=newname;
         this.phonenumber=newphonenumber;
         this.emailid=newemailid;
         this.acc_num=newacc_num;

     }
    }
    class RBI{
        int  max_intrest_rate;
        double min__bal_allow;
        float max_wdrw_limit;
       
        void max_intrestrate(){

        }
        void min_bal_allow(){

        }
        void max_wdrw_limit(){

        }
        RBI(int newmax_intrest,double newmin_bal_allow,float newmax_wdrw_limit ){
            this.max_intrest_rate=newmax_intrest;
            this.min__bal_allow=newmin_bal_allow;
            this.max_wdrw_limit=newmax_wdrw_limit;

        }
        public static void main(String[] args) {
            Customer oCustomer=new Customer("sirisha", 123456, "sirimurali@", 055999f);
            oCustomer.print();
            
        }
        



    }
    class Account1 extends RBI{
        double acc_num;
        String branchname;




    }
    class SBI{

    }
    class HDFC{

    }
    class AXIS{

    }
