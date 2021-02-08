package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        System.out.println(traco);

        String role = "admin";

        switch (role) { // Faz a função do if só que um pouco mais simples de entender
            case "admin":
                System.out.println("You are an Admin");
                break;
            case "moderator":
                System.out.println("You are a Moderator");
                break;
            default:
                System.out.println("You are a Guest");
        }

        // ou
        if (role == "admin")
            System.out.println("You are an admin");
        else if (role == "moderator")
            System.out.println("You are a moderator");
        else
            System.out.println("You are a guest");
    }
}