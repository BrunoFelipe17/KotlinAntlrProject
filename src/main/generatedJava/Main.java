package generatedJava;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int age = 21;
        String name = "Bruno";
        double price = 10.50;
        int num = 0;
        int calc = (10 + 10) * 10;
        System.out.println(calc);
        if (age > 21) {
            System.out.println(name + " can drink!");
        } else {
            System.out.println(name + " can't drink :-(");
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num++;
        }
        num = 0;
        System.out.println("");
        System.out.println("Valor de num: " + num);
        while (num < 10) {
            if (num % 2 == 0) {
                System.out.println(num + " é par");
            } else {
                System.out.println(num + " é impar");
            }
            num++;
        }
        System.out.println("Alguns calculos");
        System.out.print(price);
        price = price * 10;
        System.out.println(" *= 10: " + price);
        price = 10.50;
        System.out.print(price);
        price = price / 10;
        System.out.println(" /= 10: " + price);
        price = 10.50;
        System.out.print(price);
        price = price + 10;
        System.out.println(" += 10: " + price);
        price = 10.50;
        System.out.print(price);
        price = price - 10;
        System.out.println(" -= 10: " + price);
    }
}
