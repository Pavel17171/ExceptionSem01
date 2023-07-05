package org.example;

import java.util.ArrayList;
import java.util.List;

/*
3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов
    двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя.
 */
public class Ex03 {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4, 5};
        int[] arrTwo = {1, 2, 3, 4};
        try {
            int[] arrSub = arrSubtract(arrOne, arrTwo);
            for (int i : arrSub) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] arrSubtract(int[] arrOne, int[] arrTwo) {
        int[] arrSub = new int[arrOne.length];
        if (arrOne.length == arrTwo.length) {
            for (int i = 0; i < arrOne.length; i++) {
                arrSub[i] = arrOne[i] - arrTwo[i];
            }
        }
        else {
            throw new IllegalArgumentException("Длина массивов различная");
        }
        return arrSub;
    }
}
