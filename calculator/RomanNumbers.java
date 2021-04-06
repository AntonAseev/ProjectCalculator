package calculator;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers extends Decisions {
    static Map<String, Integer> getRomanNumbersInput() {
        Map<String, Integer> romanNumbersInput = new HashMap();
        romanNumbersInput.put("I", 1);
        romanNumbersInput.put("II", 2);
        romanNumbersInput.put("III", 3);
        romanNumbersInput.put("IV", 4);
        romanNumbersInput.put("V", 5);
        romanNumbersInput.put("VI", 6);
        romanNumbersInput.put("VII", 7);
        romanNumbersInput.put("VIII", 8);
        romanNumbersInput.put("IX", 9);
        romanNumbersInput.put("X", 10);
        return romanNumbersInput;
    }

    static Map<Integer, String> getRomanNumbersOutput() {
        Map<Integer, String> romanNumbersOutput = new HashMap<>();
        romanNumbersOutput.put(1, "I");
        romanNumbersOutput.put(2, "II");
        romanNumbersOutput.put(3, "III");
        romanNumbersOutput.put(4, "IV");
        romanNumbersOutput.put(5, "V");
        romanNumbersOutput.put(6, "VI");
        romanNumbersOutput.put(7, "VII");
        romanNumbersOutput.put(8, "VIII");
        romanNumbersOutput.put(9, "IX");
        romanNumbersOutput.put(10, "X");
        romanNumbersOutput.put(40, "XL");
        romanNumbersOutput.put(50, "L");
        romanNumbersOutput.put(90, "XC");
        romanNumbersOutput.put(100, "C");
        return romanNumbersOutput;
    }

    static int romanNumberInitialization(String s) {
        try {
            s = s.replaceAll("[^I,V,X]", "");
            return getRomanNumbersInput().get(s);
        } catch (NullPointerException e) {
            System.err.println("Числа должны быть от I до X");
        }
            System.exit(0);
        return getRomanNumbersInput().get(s);
    }


    static void conversionRate (int result){
        String res = "";
        while (result > 0) {
            if (result / 100 == 1) {
                res = res + getRomanNumbersOutput().get(100);
                System.out.println(res);
                break;
            } else if (result / 90 == 1) {
                res = res + getRomanNumbersOutput().get(90);
                result = result - 90;
                if (result == 0) {
                    System.out.println(res);
                    break;
                }
            } else if (result / 50 == 1) {
                res = res + getRomanNumbersOutput().get(50);
                result = result - 50;
                if (result == 0) {
                    System.out.println(res);
                    break;
                }
            } else if (result / 40 == 1) {
                res = res + getRomanNumbersOutput().get(40);
                result = result - 40;
                if (result == 0) {
                    System.out.println(res);
                    break;
                }
            } else if (result / 10 <= 3) {
                for (int i = 1; i <= result / 10; i++) {
                    res = res + getRomanNumbersOutput().get(10);
                }
                result = result - 10 * (result / 10);
                if (result == 0) {
                    System.out.println(res);
                    break;
                }
                if (result > 0) {
                    res = res + getRomanNumbersOutput().get(result);
                    System.out.println(res);
                    break;
                }
            }
        }
    }
}