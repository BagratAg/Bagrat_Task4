package com.company;


public class StringSum {

    public static void main(String[] args) {
//        String str = "Группа физиков теоретиков предположила что загадочная планета, которая "
//                + "существуют на окраине системы " + "является черной дырой";
//
//        System.out.println(str);
//    }
//}


        StringBuilder str = new StringBuilder();
        str.append("Группа физиков теоретиков предположила что загадочная планета, которая ");
        str.append ("существуют на окраине системы ");
        str.append("является черной дырой");

        System.out.println(str);

    }
}
