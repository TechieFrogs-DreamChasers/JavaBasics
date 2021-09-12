public class NestedClass {

//Variables 
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";
    //defalt inner class
    class InnerClass {
        //innerclass method
      void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }
//static innerclass
    static class StaticNestedClass {
        //method with varibles
        void accessMembers(NestedClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
       // outerclass object
        NestedClass outerObject = new NestedClass();
         //InnerClassobject
        NestedClass.InnerClass innerObject = outerObject.new InnerClass();
        //calling innerclass method
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        //static class object
        StaticNestedClass staticNestedObject = new StaticNestedClass();
       // calling static class method        
        staticNestedObject.accessMembers(outerObject);
        
        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        //TopLevelClassobject
       TopLevelclass   topLevelObject = new TopLevelclass();
        topLevelObject.accessMembers(outerObject);                
    }
}

    