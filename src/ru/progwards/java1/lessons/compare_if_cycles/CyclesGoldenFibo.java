package ru.progwards.java1.lessons.compare_if_cycles;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleInfo.isIsoscelesTriangle;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.maxSide;
import static ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.minSide;

public class CyclesGoldenFibo<number> {
    public static boolean containsDigit(int number, int digit) {
        boolean result = false;
        int digit1; // цифра числа number

        int number1; //строка из цисел
        String number2 = String.valueOf(number);
        do {
            digit1 = number % 10; // возвращаем остаток от деления на 10 для последующего сравнения цифр числа
            number1 = number / 10; // делим на 10 и запоминаем в number1
            number = number1; // уменьшаем на порядок число number, т.е реализуем перебор числа по цифрам
            {
                if (digit != digit1) {
                    System.out.println("ЦИФРА " + digit1 + " НЕ СОВПАДАЕТ С DIGIT = " + digit + " ЧИСЛA " + number2);
                    result = false;
                } else {

                    result = true;
                    System.out.println("ЦИФРА " + digit1 + " ВХОДИТ в ЧИСЛО " + number2);
                    break;
                }
            }

        } while (Integer.valueOf(number) > 0);
        return result;
    }

    public static int fiboNumber(int n) {
        int i = 1;
        //  int count = 1;
        int prev1 = 0;
        int prev2 = 1;
        int next = 1;
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;
        do {
            if (isIsoscelesTriangle(prev1, prev2, next) == true) {
                next = prev1 + prev2;
                prev2 = prev1;
                prev1 = next;
//            System.out.println("Cледующий равен сумме двух предыдущих NEXT = " + next);
            }
            i++;
        } while (i <= n);
        return next;

    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        double minValue = 1.61703;
        double maxValue = 1.61903;
        double compareOfSide = 100000e-5;
        compareOfSide = maxSide(a, b, c) / minSide(a, b, c);//Double.valueOf(maxSide(a, b, c) / minSide(a, b, c));
        double bc = b / c;
        double ac = a / c;
     //   if (isIsoscelesTriangle(a, b, c) == true) {
       //     if ((compareOfSide > minValue && compareOfSide < maxValue)) {
                System.out.println("a = " + maxSide(a, b, c) + " Результат1 b = "+minSide(a, b, c) +" ++ " + compareOfSide +" ++ "+ minValue + " ++ "+ maxValue);
            //    return true;
         //   }

       // }
        return false;
    }
}