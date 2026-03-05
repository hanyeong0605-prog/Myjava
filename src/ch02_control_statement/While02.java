package ch02_control_statement;

public class While02 {
    static void main(String[] args) {
        int odd = 0; //홀
        int even = 0;//짝
        int add = 0;
        int i = 1;
        while(i <= 10) {
            add = add + i;


            switch (i % 2) {
                case 0:
                    even = even + i;
                    break;
                case 1:
                    odd = odd + i;
                    break;
            }
            //i++;
        }
            System.out.println("홀수의 총합 : "+ odd);
            System.out.println("짝수의 총합 : "+ even);

        }






    }

