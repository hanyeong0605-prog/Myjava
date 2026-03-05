package ch02_control_statement;

public class Difference {
    static void main(String[] args) {

        int sumA = 0;
        int sumB = 0;
        int diff;

        for (int i = 0; i <= 50 ; i++)
        {
            if(i % 3 == 0) {
                sumB = sumB + i;
            }
            else {
                sumA = sumA + i;
            }
        }
        diff = sumA - sumB;


        System.out.println("3의 배수의 총합 :" + sumB);
        System.out.println("3의 배수가 아닌 정수의 총합 :"+ sumA);
        System.out.println("차이 :" +diff);
    }
}
