package ru.progwards.java1.lessons.compare_if_cycles;

import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isRightTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isIsoscelesTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.CyclesGoldenFibo.containsDigit;
import static ru.progwards.java1.lessons.compare_if_cycles.CyclesGoldenFibo.fiboNumber;
import static ru.progwards.java1.lessons.compare_if_cycles.CyclesGoldenFibo.isGoldenTriangle;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {//Фунция должна вернуть наибольшую длину стороны треугольника
        int max; //максимальная длина стороны

        if (a > b && a > c) {
            max = a;
            return max;
        }  else
            if (b > a && b > c) {
            max = b;
            return max;
        } else// if (c > a && c > b) {
            max = c;
            return max;
    }

    //Фунция должна вернуть наименьшую длину стороны треугольника
    public static int minSide(int a, int b, int c) {
        int min; //минимальная длина стороны

        if (a < b && a < c) {
            min = a;
            return min;
        } else if (b < a && b < c) {
            min = b;
            return min;
        } else
            //if (c < a && c < b) {
            min = c;

        return min;
    }

        //Фунция должна вернуть true, если треугольник равносторонний и false в противном случае
        public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean ResultOfCompare; //результат сравнения длин сторон
        if (minSide(a,b,c) == maxSide(a,b,c)) {    //вариант (a == b && b == c && c == a)
            ResultOfCompare = true;
        }
       else {
            ResultOfCompare = true;
        }
            return ResultOfCompare;
    }


    public static void main (String[] args) {
        System.out.println("max = " + maxSide(25, 25, 19));
        System.out.println("min = " + minSide(25, 24, 26));
        System.out.println("Tреугольник является равносторонним ? " + isEquilateralTriangle(8,8,8));

        System.out.println("По данным трём сторонам (a, b, c) можно построить треугольник ? " + isTriangle(31, 21, 51));
        System.out.println("Треугольник является прямоугольным ? " + isRightTriangle(6,10,8));
        System.out.println("Треугольник является равнобедренным ? " + isIsoscelesTriangle(7,7,6));

        System.out.println("Возвращать TRUE, если число number содержит цифру digit " + containsDigit(10801843,0));
        System.out.println("Числа Фибоначчи это ряд чисел 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 - первые два элемента равны 1, а каждый следующий равен сумме двух предыдущих " + fiboNumber(15));

        System.out.println("Числа Фибоначчи от 1 до 15");
        for (int i = 0; i <= 15; i++)
        { System.out.println("I= " + i + " Число Фибоначчи = "+ fiboNumber(i));


        }

        System.out.println("Треугольник является ЗОЛОТЫМ ?  "+ isGoldenTriangle(13,8,13));
    //if ()
    } ;
        //
    //}

}

