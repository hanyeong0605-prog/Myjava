package ch02_control_statement;

import org.w3c.dom.ls.LSOutput;

public class PrintStar {
    static void main(String[] args) {

        int star = 12;

        for (star = 1; star <= 12; star=star+1) {
            System.out.print("*");
            if (star % 5 == 0) {
                System.out.println();

            }

        }

        }
    }

/*for (i = 1; star <= 12; i=i+1) {
        System.out.print("*");
            if (i % 5 == 0) {
        System.out.println();
  */


