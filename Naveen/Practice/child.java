public class child { 
        void run()
        {
            System.out.println("child is running");
        }  
      }  
      //Creating a child class  
      class Tool extends child{  
        public static void main(String args[]){  
        //creating an instance of child class  
        Tool obj = new Tool();  
        //calling the method with child class instance  
        obj.run();  
        }  
    
}

