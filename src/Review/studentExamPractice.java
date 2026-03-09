package Review;

import java.util.Scanner;

public class studentExamPractice {
    static void main(String[] args) {
        double total = 0;
        double average = 0;

        Scanner scan = new Scanner(System.in);


        System.out.print("이름을 입력하세요 : ");
        String name = scan.nextLine();

        int[] jumsu = new int[3];

        for (int i = 0; i < jumsu.length; i++) {
            System.out.print("국어 점수 : ");
            jumsu[i] = scan.nextInt();


        }

    }
}
