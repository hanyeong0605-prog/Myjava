package ch02_control_statement;

import java.util.Scanner;

public class While04 {
    static void main(String[] args) {

        int total = 0; // 총점
        double average = 0.0; // 평균
        Scanner sc = new Scanner(System.in);
        int counter = 0;


        while (true) {  // while문 무한루프 시작.
            System.out.println("점수를 입력해 주세요.");


            int jumsu = sc.nextInt();/////////////////////////////////////형식 기억해~~~~~



            if (jumsu < 0) {
                System.out.println("음수 입니다.");
                break;
            }

            counter++; //(counter = counter + 1)
            total += jumsu;
        } // While 문 내부에서 루프 돌려야 하는지 아닌지 잘 파악하기.


        System.out.println("총합 : " +total);
        System.out.println("평균 : "+total/counter);


    }
}
