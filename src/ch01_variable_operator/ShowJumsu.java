package ch01_variable_operator;

public class ShowJumsu {
    static void main() {
        String name;
        double Kor;
        double Eng;
        double Avg;

        name = "홍길동";
        Kor = 40.0;
        Eng = 43.0;
        Avg = (Kor + Eng)/2;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + Kor);
        System.out.println("영어 : " + Eng);
        System.out.println("평균 : " + Avg);


    }
}
