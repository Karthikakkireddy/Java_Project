package com.tight.coupling;

public class Main {
    public static void main(String[] args) {
       UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}