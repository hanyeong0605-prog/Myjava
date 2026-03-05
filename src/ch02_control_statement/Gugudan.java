package ch02_control_statement;

public class Gugudan {
    static void main(String[] args) {
        int dan = 3;
        int gugu = 0;
        for (int i = 1; i <= 9 ; i= i+1) {

            gugu = dan * i;

            System.out.println(dan+"*"+i+"="+gugu);
        }

    }
}

//for (int i = 1; i <= 9 ; i= i+1) {
//
//           String message = "%d * %d = %d;
//              System.out.println(message, dan, i, (dan*i));


