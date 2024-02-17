
package notebook.controller;

import notebook.model;
import notebook.view;
public class Controller {
    // код, который отвечает за обработку действий пользователя
    // (любое действие пользователь в системе обрабатывается в контроллере)
    void controlAction() {
        switch (action) {
            case "+":
                System.out.println("Результат сложения комплексных чисел = " + summReal + " + " + summImage + "i");
                break;
            case "-":
                System.out.println("Результат вычитания комплексных чисел = " + difReal + " + " + difImage + "i");
                break;
            case "*":
                System.out.println("Результат умножения комплексных чисел = " + multiplyReal + " + " + multiplyImage + "i");
                break;
            case "/":
                if (divideImage != 0) {
                    System.out.println("Результат деления комплексных чисел = " + divideReal + " + " + divideImage + "i");
                    break;
                } else {
                    System.out.println("You can't divide to 0!");
                }
        }
    }
}
