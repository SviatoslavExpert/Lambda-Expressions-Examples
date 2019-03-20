package com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        MyGreeting morningGreeting = (str) -> "Good morning " + str + "!";
        MyGreeting eveningGreeting = (str) -> "Good evening " + str + "!";

        System.out.println(morningGreeting.processName("Mike"));
        System.out.println(eveningGreeting.processName("Jessica"));
    }
}
