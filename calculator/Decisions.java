package calculator;

public abstract class Decisions {
    static int decision(int a, int b, char c){

        if (c == '+') {
            return a+b;
        } else if (c == '-') {
            return a-b;
        } else if (c == '*') {
            return a*b;
        } else if (c == '/') {
            return a/b;
        }
        return 0;
    }
}
