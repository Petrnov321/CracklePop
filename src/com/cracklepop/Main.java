package com.cracklepop;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String s = String.valueOf(i);
            if ((i%3 == 0) && (i%5 == 0)) {    s = "CracklePop";    }
            else if (i%3 == 0){    s = "Crackle";    }
            else if (i%5 == 0) {     s = "Pop";     }

            System.out.println(s);
        }
    }
}
