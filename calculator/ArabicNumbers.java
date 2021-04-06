package calculator;

public class ArabicNumbers extends Decisions {

    static int arabicNumberInitialization(String s){
        try {
        s = s.replaceAll("[^0-9]", "");
        if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) > 10) {
            throw new IllegalArgumentException();
        }
        } catch (IllegalArgumentException e) {
            System.err.println("Числа должны быть от 1 до 10");
            System.exit(0);
        }
        return Integer.parseInt(s);

    }

}
