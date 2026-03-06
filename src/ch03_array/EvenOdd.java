package ch03_array;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        int even = 0;  int odd = 0;  // 합산 변수들은 반복하기 전에 정의 ★ ★

        Scanner sc = new Scanner(System.in);

        System.out.print("배열 요소 개수 입력 : ");

        int size = sc.nextInt();

        int[] jumsu = new int[size];
        for (int i = 0; i < jumsu.length;  i++)   // size를 대신 넣어도 괜찮음.
        {
            System.out.print(i + "번째 정수 입력 : ");
            jumsu[i] = sc.nextInt();

            if(jumsu[i] % 2 == 0) {    // 요소의 값이 짝수이면
                even = even + jumsu[i];
            }
            else { // 홀수이면
                odd = odd + jumsu[i];
            }
        }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

    }
}
