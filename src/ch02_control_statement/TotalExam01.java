package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {

        String name = "김철수";
        int kor = 85, eng = 70, math = 90;

        String grade;

        String message = "";


        double average = (kor + eng + math) / 3.0;


        if (average >= 90.0) {
            grade = "A";
        }
        else if (average >=80.0) {
            grade = "B";
        }
        else if (average >=60.0) {
            grade = "C";
        }
        else if (average >=50.0) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        switch (grade) {
            case "A": case "B":
               message = "참 잘하셨습니다.";
               break;
            case "C": case "D":
                message = "조금만 더 노력하세요.";
            case "F":
                message = "다음 학기에 재수강하세요.";
            default:
                message = "잘못된 입력입니다.";
        }


        System.out.printf("이름 : %s", name);
        System.out.println();
        System.out.printf("국어 : %d 점, 영어 : %d 점, 수학 : %d 점", kor, eng, math);
        System.out.println();
        System.out.printf("총점 : %s, 평균 : %.5f", kor + eng + math, average);
        System.out.println();
        System.out.printf("학점 : %s",grade);
        System.out.println();
        System.out.printf("메시지 : %s",message);


    }
}
