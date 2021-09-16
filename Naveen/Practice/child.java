public class child { 
        void run()
        {
            System.out.println("child is running");
        }  
      }  
      //Creating a child class  
      class Bike extends child{  
        public static void main(String args[]){  
        //creating an instance of child class  
        Bike obj = new Bike();  
        //calling the method with child class instance  
        obj.run();  
        }  
    
}
