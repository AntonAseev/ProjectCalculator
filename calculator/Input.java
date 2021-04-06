package calculator;

import java.util.Scanner;

public class Input {

    static String firstValue(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static String[] inputProcessing1 (String s) {

        if (s.indexOf('+') > 0) {
           return s.split("\\+", 2);
        } else if (s.indexOf('-') > 0) {
            return s.split("-", 2);
        } else if (s.indexOf('*') > 0) {
            return s.split("\\*", 2);
        } else if (s.indexOf('/') > 0) {
            return s.split("/", 2);
        }
        return null;
    }

    static char getOperator(String s) {
        char c = '0';
        try {
            c = s.replaceAll("[^+,*,/,-]", "").charAt(0);
            return c;
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Калькулятор может выполнять только следующие действия: сложение(+), вычитание(-), умножение(*) и деление(/)");
        }
        System.exit(0);
        return c;
    }
}
