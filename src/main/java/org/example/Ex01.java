package org.example;

// 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Ex01 {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 6, 4, 7};
        methodOne(array, 1);   // Ошибка: ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
        methodTwo(5, 0);        // Ошибка: ArithmeticException: / by zero
        methodThree("text");       // Ошибка: NumberFormatException: For input string: "text"
    }

    public static void methodOne(int[] arr, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void methodTwo(int a, int b) {
        System.out.println(a / b);
    }

    public static void methodThree(String a) {
        System.out.println(Integer.parseInt(a) * 100);
    }
}


