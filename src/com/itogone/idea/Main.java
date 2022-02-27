package com.conver.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kурс доллара: ");
        double ex1 = input.nextDouble();  //  67,55
        System.out.print("Количество рублей: ");
        int ex2 = input.nextInt();   //  1000

        double rezult = ex2 / ex1;
        String convert = String.format("%.2f", rezult);
        System.out.print("Итого: " + convert + " долларов");
    }
}
