public class SingleAnimal {
    void eat(){
        System.out.println("eating..");
    }
}
    class dog extends SingleAnimal{
        void bite(){
            System.out.println("bite..");
        }
    }
    class babydog extends dog{
            void drink(){
            System.out.println("drink..");
        }
    
    }
    
    class single{

        public static void main(String[] args) {
            babydog obd = new babydog();
            obd.drink();
            obd.bite();
            obd.eat();
        }
    }
    

    

