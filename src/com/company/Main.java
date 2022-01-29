package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя:”
    Затем считывала имя пользователя, введенное с клавиатуры
    И в конце здоровалась с пользователем по имени которое вы ввели с клавиатуры
	 */
        System.out.println("Введите ваше имя:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Name: " + name);
    }
}
