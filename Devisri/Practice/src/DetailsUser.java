public class DetailsUser {
    String user_Name;
    String email;
    long phone;
    boolean submit;

    public DetailsUser() {
        this("Tim","Tim@email.com",5648971230L,true);
    }

    public DetailsUser(boolean submit) {
        this.submit = submit;
    }

    public DetailsUser(String user_Name, String email) {
        this(3692581470L,false);
        this.user_Name = user_Name;
        this.email = email;
    }

    public DetailsUser(long phone, boolean submit) {
        this.phone = phone;
        this.submit = submit;
    }

    public DetailsUser(String user_Name, String email, long phone) {
        this(false);
        this.user_Name = user_Name;
        this.email = email;
        this.phone = phone;
    }

    public DetailsUser(String user_Name, String email, long phone, boolean submit) {
        this.user_Name = user_Name;
        this.email = email;
        this.phone = phone;
        this.submit = submit;
    }

    public static void main(String[] args) {
        DetailsUser detailsUser=new DetailsUser();
        detailsUser.details();
        DetailsUser du=new DetailsUser("Jenny","Jenny@email.com");
        du.details();
        DetailsUser du1=new DetailsUser("Jenny","Jenny@email.com",8527410963L);
        du1.details();
    }
    void details(){
        System.out.println(user_Name+" "+email+" "+phone+" "+submit);
    }
}
