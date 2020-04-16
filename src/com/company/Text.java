package com.company;

public class Text {
// слово из последних букв

        public static void main(String[] args) {
            String str = "люди эльфы орки гоблины";
            StringBuilder res = new StringBuilder();

            String [] words = str.split("\\s+");
            for ( String word : words )
                res.append(word.toCharArray()[word.length() - 1]);

            System.out.println(res.toString());
        }

    }
