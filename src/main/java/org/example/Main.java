package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите шифр: ");
        String in = scanner.nextLine();

        System.out.println("Введите ключ: ");
        int key = scanner.nextInt();

        System.out.println("Если хотите расшифровать введите 1:\nЕcли хотите расшифровать введите 2: ");
        int a = scanner.nextInt();
        boolean encrypt = a == 1;;

        System.out.println(CaesarsCipher.caesar(in, key, encrypt));
    }

}
