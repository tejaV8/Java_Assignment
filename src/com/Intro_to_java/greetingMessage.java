package com.Intro_to_java;

import java.util.Scanner;

public class greetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.printf("Hello! " + name + " Welcome");
    }
}
