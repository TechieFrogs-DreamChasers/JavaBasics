public class HumanBeing {
        String name="Divya";
        String nature="Kind";
        int id=50;
        String behaviour="has a good helping nature";
        String gender="She";
        String type="Person.";
        public static void main(String[] args) {
            HumanBeing humanBeing=new HumanBeing();
            humanBeing.description();//method call
        }
     public void description(){
         System.out.println(name+" is one of my friend. "+gender+ " is "+nature+" and "+behaviour+" with an id of "+id+" and is of a type "+type);
     }
}
