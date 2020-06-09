package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit)
    {  boolean result=false;
     //  String str1 = String.valueOf(number);
     //  String symbol;
        int digit1;

           for(int i=1;i<=number;i++){
            digit1=number%10;
            int number1 = number;
            if(digit==digit1) {
                result=true;break;}
                else {if(number1>0&&number1<=10&&digit==digit1) {result=true; return result;} else { //груз
                number = number/10;
                result = false;
            }
            }
        }
        return result;
    }
}
