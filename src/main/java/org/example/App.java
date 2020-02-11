package org.example;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter operands");
        System.out.print("a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Select either one of the operator from +, -, *, /");
        char c = scanner.nextLine().charAt(0);
        BinaryOperator<Double> calculate;
        switch (c) {
            case '+':
                calculate = (x, y) -> x + y;
                break;
            case '-':
                calculate = (x, y) -> x - y;
                break;
            case '*':
                calculate = (x, y) -> x * y;
                break;
            case '/':
                calculate = (x, y) -> x / y;
                break;
            default:
                throw new Exception("Invalid Input");
        }
        System.out.println("Result " + calculate.apply(a, b));
    }
}
