package ExceptionAssignment;
//chained exceptions
public class P7 {
   public static void main(String [] args){


   }

   public void wantFood(){

       throw New NoFood("No Food",MomAngry);
   }

   void callMom(){
       throw New MomAngry("Angry");
   }

    class NoFood extends Exception{
        public NoFood(String msg,Throwable cause){
            super(msg,cause);
        }
        public NoFood(String msg){
            super(msg);
        }

    }

    class MomAngry extends Exception{
        public MomAngry(String msg,Throwable cause){
            super(msg,cause);
        }
        public MomAngry(String msg){
            super(msg);
        }
    }

}
/*abstractpublic class MainClass {

    public void main(String[] args) throws Exception {
        getLeave();
    }

    void getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            e.printStackTrace();
            throw new NoLeaveGrantedException("Leave not sanctioned.");
        }
    }

    void howIsTeamLead() throws TeamLeadUpsetException {
        throw new TeamLeadUpsetException("Team Lead Upset");
    }
}
with chaining:
public class MainClass {
    public void main(String[] args) throws Exception {
        getLeave();
    }

    public getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
             throw new NoLeaveGrantedException("Leave not sanctioned.", e);
        }
    }

    public void howIsTeamLead() throws TeamLeadUpsetException {
        throw new TeamLeadUpsetException("Team lead Upset.");
    }
}*/