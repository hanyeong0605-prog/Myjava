package ch02_control_statement;

import java.util.Scanner;

public class While03 {
    static void main(String[] args) {

        //String str = "*";
        int answer = 40;

        //바코드 스캐너 준비. (scan을 준비합니다.)
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");


        while (true) { // endless while loop
            System.out.println("1부터 100 사이의 정수를 입력해주세요.");
            int input = sc.nextInt();


            if (answer == input) {
                System.out.println("정답입니다.");
                break;
            } else if (input > answer && input < 100 && input > 0) {
                System.out.println("틀렸습니다. Down");

            } else if (input < answer && input < 100 && input > 0) {
                System.out.println("틀렸습니다. Up");
            }
            else {
                    System.out.println("잘못된 입력입니다.");
                }
                }


            }
        }





