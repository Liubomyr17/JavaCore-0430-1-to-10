package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.

Пример для чисел -4 6 6:
2

Пример для чисел -6 -6 -3:
0

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
*/

public class Main {

    public static void main(String[] args) throws Exception {
        int a = 1;
        while (a < 11) {
            System.out.println(a);
            a++;
        }
    }
}

