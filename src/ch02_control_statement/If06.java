package ch02_control_statement;

public class If06 {
    static void main() {
        int month = 15;
        if (month >= 3 && month <= 5) {
            System.out.println("봄 입니다.");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("여름 입니다.");
        }
        else if (month >= 9 && month <= 11) {
            System.out.println("가을 입니다.");
        }
        else if (month == 12 || month == 1 || month == 2) {
            System.out.println("겨울 입니다.");
        }
        else {
            System.out.println("1월부터 12월로 입력해주세요.");
        }
    }
}
