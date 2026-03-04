package ch02_control_statement;

public class If01 {
    static void main() {
        //su가 짝수이면 출력해 주세요.
        int su = 5  ;
        if(su % 2 == 0) {
            System.out.println(su+"는 짝수 ");
        }
        else {
            System.out.println(su+"는 홀수  ");
        }
        System.out.println("나는 무조건 실행됩니다. ");
    }
}
