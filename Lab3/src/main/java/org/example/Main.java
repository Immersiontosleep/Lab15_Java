package org.example;

import java.util.Scanner;
import java.util.regex.*;

public class Main {
    static class Employee {
        String name; double salary;
        Employee(String n, double s) { name = n; salary = s; }
    }

    static void printReport(Employee[] e) {
            System.out.printf("%-15s %10s%n","Фамилия","Зарплата");
        for (Employee x : e)
            System.out.printf("%-15s  %10.2f%n", x.name, x.salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите задание (1-4): ");
        int task = sc.nextInt();

        switch (task) {
            case 1:
                System.out.println("АБВГДЕЁЖЗИЙКЛМНОПРСТ".substring(4));
                break;
            case 2:
                String[] w = "Просто что то потому что надо понять какое значение забирает э то то то".split("\\s+");
                String min = w[0];
                for (String s : w) if (s.length() < min.length()) min = s;
                System.out.println(min);
                break;
            case 3:
                printReport(new Employee[]{
                        new Employee("Иванов И.И.", 1500.5),
                        new Employee("Петров П.П.", 2300.0),
                        new Employee("Сидорова А.Б.", 950.75)
                });
                break;
            case 4:
                Matcher m = Pattern.compile("a[D-Z]a").matcher("aAa aBa aCa aDa aEa aFa aGa");
                while (m.find()) System.out.print(m.group() + " ");
                System.out.println();
                break;
            default:
                System.out.println("Неверный номер задания");
        }
        sc.close();
    }
}