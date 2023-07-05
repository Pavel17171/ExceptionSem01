package org.example;

/*
*  Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов
    двух входящих массивов в той же ячейке. Если длины массивов не равны,
    необходимо как-то оповестить пользователя. Важно: При выполнении метода
    единственное исключение, которое пользователь может увидеть - RuntimeException,
    т.е. ваше.
 */

public class Ex04 {
    public static void main(String[] args) {
        int[] arrOne = {1, 2, 3, 4, 5};
        int[] arrTwo = {1, 2, 3, 4, 0};
        try {
            int[] arrSub = arrSubtract(arrOne, arrTwo);
            for (int i : arrSub) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] arrSubtract(int[] arrOne, int[] arrTwo) {
        int[] arrSub = new int[arrOne.length];
        if (arrOne.length == arrTwo.length) {
            for (int i = 0; i < arrOne.length; i++) {
                if (arrTwo[i] != 0) {
                    arrSub[i] = arrOne[i] - arrTwo[i];
                }
                else {
                    throw new RuntimeException("На ноль делить нельзя!");
                }
            }
        }
        else {
            throw new RuntimeException("Длина массивов различная");
        }
        return arrSub;
    }

}
