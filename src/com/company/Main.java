package com.company;

public class Main {

    public static void main(String[] args) {


        Dot qun = new Dot();
        HowManyWords result = new HowManyWords();

        String str = "Группа физиков-теоретиков предположила, что загадочная планета, которая, как считается, " +
                "вращается вокруг Солнца на краю Солнечной системы, на самом деле может быть черной дырой.";
        int n = 0;
        int p = 0;

        while (p != -1) {
            p = str.indexOf(',', p);
            if (p != -1) {
                p++;
                n++;
// количество символов (, и .)
                System.out.println("количство запятых - " + n + " количество точек " + qun.i);

                int j = n + qun.i;
                // количество символов
                System.out.println("итого символов - " + j);
//поиск слов в предложении
                System.out.println("количество слов в предложении " + result.length);


            }
        }
    }
}

