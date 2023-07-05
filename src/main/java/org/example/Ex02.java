package org.example;

// 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class Ex02 {

    public static void main(String[] args) {
        String[][] a = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"} };    // Без ошибок (проверочный)
        //String[][] a = {null};                                                   // NullPointerException
        //String[][] a = {{"1", "2", "3", "4", "5"}, {"1", "2", "3", "4"} };       // ArrayIndexOutOfBoundsException
        //String[][] a = {{"1", "2", "3", "4", "a"}, {"3", "1", "5", "4", "4"} };  // NumberFormatException

        sum2d(a);

        System.out.println(sum2d(a));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {          // NullPointerException
            for (int j = 0; j < 5; j++) {               // ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]);  // NumberFormatException
                sum += val;
            }
        }
        return sum;
    }
}
