package ru.progwards.java1.lessons.compare_if_cycles;

import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isRightTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isIsoscelesTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.CyclesGoldenFibo.containsDigit;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) //Фунция должна вернуть наибольшую длину стороны
    {
        int max = 0; //максимальная длина стороны
        if (a > b && a > c) max = a;
        else {
            if (b > a && b > c) max = b;
            else {
                if (c > a && c > b) max = c;
            }

        }
        return max;
    }
    public static int minSide(int a, int b, int c)//Фунция должна вернуть наименьшую длину стороны
    {
        int min = 0; //минимальная длина стороны
        if (a < b && a < c) min = a;
        else {
            if (b < a && b < c) min = b;
            else {
                if (c < a && c < b) min = c;
            }


        }
        return min;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c) //Фунция должна вернуть true, если треугольник равносторонний и false в противном случае.
    { boolean ResultOfCompare = false; //результат сравнения длин сторон
        if (a == b && b == c && c==a) ResultOfCompare = true;
        return ResultOfCompare;
    }

    public static void main(String[] args) {
        System.out.println("max = " + maxSide(25, 25, 19));
        System.out.println("min = " + minSide(25, 24, 26));
        System.out.println("Tреугольник является равносторонним ? " + isEquilateralTriangle(10, 10, 10));

        System.out.println("По данным трём сторонам (a, b, c) можно построить треугольник ? " + isTriangle(31, 21, 51));
        System.out.println("Треугольник является прямоугольным ? " + isRightTriangle(6,10,8));
        System.out.println("Треугольник является равнобедренным ? " + isIsoscelesTriangle(7,7,6));

        System.out.println("Возвращать true, если число number содержит цифру digit " + containsDigit(2751853,8));

    }

}