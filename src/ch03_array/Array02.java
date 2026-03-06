package ch03_array;

import java.util.Scanner;

public class Array02 {
    static void main(String[] args) {
        //bts 멤버들을 초기화 기법으로 풀어 보세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("번호를 입력하세요.");


        String[] _bts = {"1진", "2뷔", "3정국", "4RM", "5지민", "6슈가", "7제이홉"};
        for (int i = 0; i < _bts.length; i++) {
            int input = sc.nextInt();




            System.out.println(_bts[i]);

        }

    }
}
