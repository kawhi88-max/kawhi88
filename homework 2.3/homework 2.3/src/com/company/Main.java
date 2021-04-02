package com.company;

public class Main {

    public static void main(String[] args) {
    messageForMe();
    addition();
        System.out.println(quantity());
        printOffer();
        System.out.println(game());
    }
    public  static void messageForMe(){
        System.out.println("Hey");
        System.out.println("everbody");
    }
    public static void addition(){
        int digitFirst = 15;
        int digitFour = 30;
        System.out.println(digitFirst * digitFour);
    }
    public static int quantity(){
        return 45 / 5;
    }
    public static void printOffer(){
        System.out.println("Goodbye my friends");
    }
    public static String game(){
        return "Left 4 Dead";
    }
}
