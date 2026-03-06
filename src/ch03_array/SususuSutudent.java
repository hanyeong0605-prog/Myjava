package ch03_array;

import java.util.Scanner;

public class SususuSutudent {
    static void main(String[] args) {

        String name = "";
        double total = 0;
        double average = 0;
        int kor = 0;
        int eng = 0;
        int math = 0;

        Scanner scan = new Scanner(System.in);


        System.out.print("이름 입력 : "+name);
        name = scan.next();







        String[] hak = {"국어","수학","영어"};

        int[] jumsu = new int[3];

        for (int i = 0; i < jumsu.length; i++) {

            System.out.print(hak[i]+"점수 입력 : ");
            jumsu[i] = scan.nextInt();

            total = total + jumsu[i];

        }

        average = (total)/3;


        System.out.printf("학생 정보\n");
        System.out.print("이름 : " +name);
        System.out.printf("총점 : %f ",total);
        System.out.printf("평균 : %f ",average);



    }
}
