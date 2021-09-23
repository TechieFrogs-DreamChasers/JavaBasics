package InterfacesExercise;

public class Program6 {
    public interface First{
        void firstMethod1();
        void firstMethod2();
        
    }
    public interface Second{
        void secondMethod1();
        void secondMethod2();
    }
    public interface Third {
        void thirdMethod1();
        void thirdMethod2();
    }
    public interface Fourth extends Third{
        void fourthMethod1();
        
    }

    public class MyClass{
            void display(){
            System.out.println("In MyClass Display");
        }
    }
    /*
    public class NewClass extends MyClass implements Fourth{
        public void fourthMethod1(){
            System.out.println("In interface fourth method1");
        }
        
        
        public void thirdMethod1(){
            System.out.println("In interface third method1");
        }
        public void thirdMethod2(){
            System.out.println("In Interface Third Method2");
        }

        public void firstMethod2(){
            System.out.println("In Interface First Method2");
        }

        

    } */   
        public static void main(String... args){
            Program6 pro = new Program6();

        }
}


