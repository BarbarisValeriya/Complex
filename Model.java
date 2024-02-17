package notebook.model;

import notebook.view;
import notebook.controller;
public class Model {
    // бизнес-логика приложения - комплексных чисел,
    // я без понятия как по другому их описывать и в принципе с ними никогда не работала.
    static int summReal = num1 + num3;
    static int summImage=  num2 + num4;
    static int difReal = num1 - num3;
    static int difImage = num2 - num4;
    static int multiplyReal = num1*num3 - num2*num4;
    static int multiplyImage = num1*num4 - num3*num2;
    static int divideReal = ((num1*num3 + num2*num4)/(num3*num3+num4*num4));
    static int divideImage = ((num3*num2 - num1*num4)/(num3*num3+num4*num4));


}
