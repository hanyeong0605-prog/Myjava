package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            double total = 0;

            double average = 0;

        System.out.print("이름입력 : ");
        String name = scan.nextLine();   /// next로 하던가 nextLine으로 가능.
//****************************************//

        int[] jumsu = new int[3];


        for (int i = 0; i < jumsu.length ; i++) {

            System.out.print("점수 입력 : ");
            jumsu[i] = scan.nextInt();


                total = total + jumsu[i];
                average = total / 3;


        }
        System.out.println("학생의 정보");
        System.out.printf("이름 : %s , 총점 : %.2f , 평균 : %.2f",name,total,average);
    }

}

