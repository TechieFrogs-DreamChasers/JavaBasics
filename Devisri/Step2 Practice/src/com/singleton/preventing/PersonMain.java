package com.singleton.preventing;

public class PersonMain {
    public static void main(String[] args) throws CloneNotSupportedException {
       // Person sam=PersonUtility.createInstance();
        Person samuel=PersonUtility.createInstance();

        //sam.setName("Sam");
        //sam.setAge(29);
        //sam.setPhone(6258291475L);
        //sam.setEmployed(true);

        samuel.setName("Samuel");
        samuel.setAge(18);
        samuel.setPhone(6259281475L);
        samuel.setEmployed(false);

       // System.out.println(sam.hashCode()==samuel.hashCode());
       // System.out.println(sam);
        System.out.println(samuel);
        /*
        true
        Samuel	18	6259281475	false
        Samuel	18	6259281475	false
        */
        Person sam_Two= (Person) samuel.clone();
        System.out.println(samuel.hashCode()==sam_Two.hashCode());
        System.out.println(samuel);
        System.out.println(sam_Two);
        /*
        Samuel	18	6259281475	false
        Exception in thread "main" java.lang.CloneNotSupportedException: Singleton Pattern Prevention
            at com.singleton.preventing.Person.clone(Person.java:47)
            at com.singleton.preventing.PersonMain.main(PersonMain.java:26)
         */
    }
}
