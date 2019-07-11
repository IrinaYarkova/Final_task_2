package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество чисел:");
        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.println("Введите числа массива для сортировки:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Ваш массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        int key;
        for (int i = 1; i < size; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("\nВаш отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}