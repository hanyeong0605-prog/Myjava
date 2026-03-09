package ch04_class;

import java.util.Scanner;

public class JumsuMain {
    static void main(String[] args) {
        Jumsu score = new Jumsu();



        score.setName("김한영",-10,30,40);
        score.Calc();


        /*Scanner scan = new Scanner(System.in);
        Jumsu score = new Jumsu();
        System.out.print("이름을 입력하세요 :");
        score.setName("");
        String name = scan.nextLine();



        System.out.print("국어 점수를 입력하세요 : ");
        int kor = scan.nextInt();
        score.setKor(kor);


        System.out.print("수학 점수를 입력하세요 : ");
        int math = scan.nextInt();
        score.setMath(math);


        System.out.print("영어 점수를 입력하세요 : ");
        int eng = scan.nextInt();
        score.setEng(eng);

        System.out.println();*/

    }


}
