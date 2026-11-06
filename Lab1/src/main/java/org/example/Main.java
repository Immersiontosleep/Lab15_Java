package org.example;

import javax.xml.transform.Source;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Выберите задание: 1, 2, 3");
        int choise = vvod.nextInt();
        switch (choise) {
            case(1):
                System.out.println("Введите градусы Цельсия");
                Scanner celsium = new Scanner(System.in);
                int cels = celsium.nextInt();
                int farengeit = cels * 9/5+32;
                System.out.println(farengeit);
                System.out.println(cels * 9/5.+32);
                break;
            case(2):
                Scanner vvodx = new Scanner(System.in);
                double x = vvodx.nextDouble();
                Scanner vvody = new Scanner(System.in);
                double y = vvody.nextDouble();
                if (x<0&&y>0)
                {
                    System.out.println("Находится в 1 четверти");
                }
                if (x>0&y>0)
                {
                    System.out.println("Находится в 2 четверти");
                }
                if (x<0&y<0)
                {
                    System.out.println("Находится в 3 четверти");
                }
                if (x>0&y<0)
                {
                    System.out.println("Находится в 4 четверти");
                }
                break;
            case(3):
                int i;
                int  j;
                for(i = 1; i<=9; i++)
                {
                    for(j = 1; j<=9; j++)
                    {
                    System.out.print((i*j)+"\t");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.printf("Некоректный ввод");

    }
}}