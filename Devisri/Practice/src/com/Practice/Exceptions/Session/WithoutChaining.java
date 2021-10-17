package com.Practice.Exceptions.Session;

public class WithoutChaining {
    public static void main(String[] args) {
        String password=null;
        try {
            checkPassword(password);
        } catch (PasswordLengthException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }
    static void checkPassword(String password) throws PasswordLengthException {
        try {
            checkPasswordLength(password);
        } catch (PasswordNullException e) {
            //e.printStackTrace();
            throw new PasswordLengthException("LENGTH CRITERIA UN-MATCHED");
        }
    }
    static void checkPasswordLength(String password) throws PasswordNullException {
        if(password==null){
            throw new PasswordNullException("PASSWORD IS NULL. INVALID INPUT");
        }
    }
}
class PasswordNumberException extends Exception{
    public PasswordNumberException(String message) {
        super(message);
    }

    public PasswordNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
class PasswordSplCharacterException extends Exception{
    public PasswordSplCharacterException(String message) {
        super(message);
    }

    public PasswordSplCharacterException(String message, Throwable cause) {
        super(message, cause);
    }
}
class PasswordLengthException extends Exception{
    public PasswordLengthException(String message) {
        super(message);
    }

    public PasswordLengthException(String message, Throwable cause) {
        super(message, cause);
    }
}
class PasswordNullException extends Exception{
    public PasswordNullException(String s) {
        super(s);
    }

    public PasswordNullException(String message, Throwable cause) {
        super(message, cause);
    }
}