package ch02_control_statement;

public class Switch02 {
    static void main() {
    int month = 0 ;
    switch (month) {
        case 3: case 4: case 5:
            System.out.println("봄 입니다.");
            break;
        case 6: case 7: case 8:
            System.out.println("여름 입니다.");
            break;
        case 9: case 10: case 11:
            System.out.println("가을 입니다.");
            break;
        case 1: case 2: case 12:
            System.out.println("겨울 입니다.");
            break;
        default:
            System.out.println("1월부터 12월로 입력해주세요!!");

    }
    }
}
