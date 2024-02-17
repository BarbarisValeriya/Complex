package notebook.view;

import notebook.model;
import notebook.controller;

import java.util.Scanner;

public class View {
    // отображение данных пользователю
    // Все, что видит пользователь, генерируется видом
    static void scanNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first real number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input first imaginary number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input second real number: ");
        int num3 = scanner.nextInt();
        System.out.println("Input second imaginary number: ");
        int num4 = scanner.nextInt();

        System.out.println("Input action: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
    }

}
