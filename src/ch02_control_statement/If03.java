package ch02_control_statement;

public class If03 {
    static void main() {
        int jumsu = 59 ;

        // 학점 매기기..
        if (jumsu >= 90) {
            System.out.println("대학원 대학원 대학원 대학원 대학원 ");
        }
            else if (jumsu >= 80 && jumsu <= 90) {
            System.out.println("B 학점");
        }
            else if (jumsu >= 70) {
            System.out.println("C 학점");
        }
            else if (jumsu >= 60) {
            System.out.println("D  학점");
        }
            else {
            System.out.println("재수강 재수강 재수강 재수강 재수강");
        }

    }
}
