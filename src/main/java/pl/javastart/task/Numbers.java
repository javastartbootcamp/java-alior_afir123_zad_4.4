package pl.javastart.task;

import java.util.Scanner;

public class Numbers {
    static double square(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            double x = Math.pow(number, 2);
            sum = sum + x;
        }
        return sum;
    }

    static void array(double[] numbers, Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
    }
}
