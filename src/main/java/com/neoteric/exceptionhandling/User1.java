package com.neoteric.exceptionhandling;

public class User1 {
    public static void main(String[] args) {
        String userId = "Admin";
        int password = 12345;
        if (userId.equals("Admin")) {
            if (password == 2345) {
                System.out.println("****login-successfully****");
            } else {
                System.out.println("Invalid password");
            }
        }
        else{
            try {
                InvalidUserIdException i = new InvalidUserIdException();
                throw i;
            }
            catch (InvalidUserIdException ie){
                System.out.println("InvalidUserID");
                System.out.println("Re_Enter User-Id");
            }
        }
    }
}
