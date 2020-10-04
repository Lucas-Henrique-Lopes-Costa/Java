package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        String traco = "--------------------------------------------------------------------------------------------------------------------------";
        
        
        String message = new String("Hello World");
        String messageSimple = "   Hello World    " + "!!";
        message.endsWith("!!");
        
        System.out.println(message);
        System.out.println(messageSimple);

    System.out.println(traco);
        
        System.out.println(message.endsWith("!!")); // tem no final da frase ? => Bolean(false/true)
        System.out.println(messageSimple.endsWith("!!"));

    System.out.println(traco);

        System.out.println(message.length()); // conta quantas palaras

    System.out.println(traco);
        
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("Sky"));

    System.out.println(traco);

        System.out.println(messageSimple.replace("!!", "??")); //Isso são "promotes"

    System.out.println(traco);

        System.out.println(messageSimple.toUpperCase());
        System.out.println(messageSimple.toLowerCase());

    System.out.println(traco);

        System.out.println(message.trim());

    System.out.println(traco);

        // Mas, o Java não altera a String principal:
        System.out.println(message);

    }
}