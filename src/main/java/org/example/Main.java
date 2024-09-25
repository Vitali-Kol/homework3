package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(500) * 2;
        }

        System.out.println("20 случайных четных целых чисел: " + Arrays.toString(numbers));

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        int sum = 0;
        int count = 0;
        for (int number : numbers) {
            if (number != min && number != max) {
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое элементов массива без учета минимального и максимального элементов массива: " + average);
    }
}