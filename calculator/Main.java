package calculator;

public class Main {
    public static void main(String[] args) {

        String startLine = Input.firstValue();

        String[] splitLines = Input.inputProcessing1(startLine);

        char operator = Input.getOperator(startLine);

        if ((splitLines[0].startsWith("I")) || (splitLines[1].startsWith("I")) ||
           ((splitLines[0].startsWith("V")) || (splitLines[1].startsWith("V"))) ||
           ((splitLines[0].startsWith("X")) || (splitLines[1].startsWith("X")))) {
            int firstNumber = RomanNumbers.romanNumberInitialization(splitLines[0]);
            int secondNumber = RomanNumbers.romanNumberInitialization(splitLines[1]);

            int result = RomanNumbers.decision(firstNumber, secondNumber, operator);

            RomanNumbers.conversionRate(result);
        } else {
            int firstNumber = ArabicNumbers.arabicNumberInitialization(splitLines[0]);
            int secondNumber = ArabicNumbers.arabicNumberInitialization(splitLines[1]);

            System.out.println(ArabicNumbers.decision(firstNumber, secondNumber, operator));
        }
    }
}