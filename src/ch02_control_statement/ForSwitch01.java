package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {
        int odd = 0; //홀수
        int even = 0; //짝수
        int add = 0;
        for (int i = 1; i <= 10; i++) {


            switch (i % 2) {
                case 0:
                    even = even + i;
                    break;

                case 1:
                    odd = odd + i;
            }
        }
        System.out.println("홀수의 총합 : "+ odd);
        System.out.println("홀수의 총합 : "+ even);

    }
}