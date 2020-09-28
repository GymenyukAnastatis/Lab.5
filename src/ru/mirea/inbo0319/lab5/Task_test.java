package ru.mirea.inbo0319.lab5;

import java.util.Scanner;

public class Task_test
{
    public static void main (String [] args)
    {
        System.out.println("Тестирование задачи №7");
        Task_7_test ();
        System.out.println();
        System.out.println("Тестирование задачи №8");
        Task_8_test ();
        System.out.println();
        System.out.println("Тестирование задачи №9");
        Task_9_test ();
        System.out.println();
    }
    public static void Task_7_test ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для разложения на множетели");
        int n = scanner.nextInt();
        Task_7.recursion(n, 2);
    }
    public static void Task_8_test ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки полиндрома");
        String s = scanner.nextLine();
        if (Task_8.recursion(s))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static void Task_9_test ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество нулей и единиц");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Количество возможных комбинаций: " + Task_9.recursion(n, m));
    }
}
