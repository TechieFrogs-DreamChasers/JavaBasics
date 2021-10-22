package com.Practice.Exceptions.Session;

public class WithChaining {
    public static void main(String[] args)  {

        try {
            checkingPassword(null);
        } catch (PasswordLengthException e) {
            e.printStackTrace();
        }

        try {
            displayPassword("java");
        } catch (PasswordLengthException e) {
            e.printStackTrace();
        }
    }
    static void displayPassword(String password) throws PasswordLengthException {
        try{
            showPassword(password);
        } catch (PasswordNumberException e) {
            throw new PasswordLengthException("RE-CHECK PASSWORD LENGTH",e);
        }
    }
    static void showPassword(String password) throws PasswordNumberException {
        if(!(password.contains("9"))){
            throw new PasswordNumberException("AT-LEAST ONE NUMBER, CRITERIA FAILED");
        } else {
            System.out.println("Entered Password: "+password);
        }
    }
    static void checkingPassword(String password) throws PasswordLengthException {
        try{
            checkingPasswordLength(password);
        } catch (PasswordNullException e){
            throw new PasswordLengthException("LENGTH CRITERIA UN-MATCHED",e);
        }
    }
    static void checkingPasswordLength(String password) throws PasswordNullException {
        if(password==null)
            throw new PasswordNullException("INPUT IS NULL");
        else
            System.out.println(password);
    }
}
