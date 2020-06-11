package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo<number> {
    public static boolean containsDigit(int number, int digit)
    {  boolean result=false;
        int digit1; // цифра числа number

        int number1; //строка из цисел
        String number2 = String.valueOf(number);
        do {
            digit1 = number % 10; // возвращаем остаток от деления на 10 для последующего сравнения цифр числа
            number1 = number / 10; // делим на 10 и запоминаем в number1
            number = number1; // уменьшаем на порядок число number, т.е реализуем перебор числа по цифрам
               {
                if (digit != digit1)

                   {
                    System.out.println("ЦИФРА " + digit1 + " НЕ ВХОДИТ в ЧИСЛО " + number2);
                    result = false;
                   } else {

                    result = true;
                    System.out.println("ЦИФРА " + digit1 + " ВХОДИТ в ЧИСЛО " + number2);
                    break;
                }
            }

        } while(Integer.valueOf(number)>0);
        return result;


    }
}
