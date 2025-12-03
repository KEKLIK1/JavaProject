package task_22;

import java.util.*;


public class PRNCalculator {
    private Stack<Double> stack;

    public PRNCalculator() {
        stack = new Stack<>();
    }

    public void pushes(String x) {
        String[] tokens = x.trim().split("\\s+");

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                performOperation(token);
            } else {
                System.out.println("Ошибка: неверный токен '" + token + "'");
                return;
            }
        }
        if (stack.size() == 1) {
            double result = stack.pop();
            System.out.println("Результат: " + (result));
        }
        else {
            System.out.println("Ошибка: неверное выражение");
        }
    }
    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") ||
                token.equals("^");
    }

    private void performOperation(String operator) {
        if (stack.isEmpty()) {
            System.out.println("Ошибка: недостаточно операндов для операции '" + operator + "'");
            return;
        }
        double result = 0;

        switch (operator) {
            case "+":
                double a;
                double b;
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов");
                    result = 0.0;
                }
                else {
                    b = stack.pop();
                    a = stack.pop();
                    result = a + b;
                }
                break;

            case "-":
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов");
                    result = 0.0;
                }
                else {
                    b = stack.pop();
                    a = stack.pop();
                    result = a - b;
                }
                break;
            case "*":
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов");
                    result = 0.0;
                }
                else {
                    b = stack.pop();
                    a = stack.pop();
                    result = a * b;
                }
                break;
            case "/":
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов");
                    result = 0.0;
                }
                else {
                    b = stack.pop();
                    a = stack.pop();
                    if (b == 0) {
                        System.out.println("Ошибка, деление на ноль");
                        return;
                    }
                    result = a / b;
                }
                break;

            case "^":
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов");
                    result = 0.0;
                }
                else{
                b = stack.pop();
                a = stack.pop();
                result = Math.pow(a, b);
                }
                break;
            default:
                System.out.println("Ошибка: неизвестный оператор '" + operator + "'");
                return;
        }
        stack.push(result);
    }

    static void main() {
        PRNCalculator calculator = new PRNCalculator();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        calculator.pushes(input);
    }
}
