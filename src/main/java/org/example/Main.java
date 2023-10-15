package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            out.println("Usage Calculator");
            exit(1);
        }

        try {
            double operand1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double operand2 = Double.parseDouble(args[2]);
            double result = 0;

            switch (operator) {
                case '+' -> result = operand1 + operand2;
                case '-' -> result = operand1 - operand2;
                case '*' -> result = operand1 * operand2;
                case '/' -> {
                    if (operand2 == 0) {
                        out.println("Division by zero");
                        return;
                    }
                    result = operand1 / operand2;
                }
                default -> {
                    out.println("Invalid operator");
                    return;
                }
            }
            out.println("Result: " + result);
        } catch (NumberFormatException e) {
            out.println("Enter valid numbers.");
        } catch (StringIndexOutOfBoundsException e) {
            out.println("Operator is missing");
        }
    }
}
