package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) //Фунция должна вернуть true, если по данным трём сторонам (a, b, c) можно построить треугольник
    { boolean ResultOfCompare = false; //результат сравнения длин сторон

        if ((a<b+c)&&(b < a+c)&&(c < a+b)) // в треугольнике длина каждой из сторон меньше суммы длин двух других сторон
            ResultOfCompare = true;
          return ResultOfCompare;

    }
    public static boolean isRightTriangle(int a, int b, int c) //Фунция должна вернуть true, если треугольник со сторонами a, b, c является прямоугольным
    {
        boolean ResultOfCompare = false; //результат сравнения длин сторон
        if (a * a == (b * b + c * c)) ResultOfCompare = true; // треугольник является прямоугольным (теорема Пифагора)
              else {   if (b * b == (a * a + c * c)) ResultOfCompare = true;
                     else { if (c * c == (a * a + b * b)) ResultOfCompare = true;
                     }
              }
        return ResultOfCompare;
    }


    public static boolean isIsoscelesTriangle(int a, int b, int c)//Фунция должна вернуть true, если треугольник со сторонами a, b, c является равнобедренным
    {boolean ResultOfCompare = false; //результат сравнения длин сторон
     //   if (a < (b+c) && b < (a+c) && c < (a+b)) ResultOfCompare = true; // треугольник является равнобедренным , если в равнобедренном треугольнике есть две равные стороны
        if ((a==b && a==c || b==c)||(b==a && b==c || a==c)||(c==a && c==b || a==b))ResultOfCompare = true;// треугольник является равнобедренным a=b && b=c || c=a
        return ResultOfCompare;
    }
}