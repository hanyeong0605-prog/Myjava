package ch01_variable_operator;

public class Assignment01 {
    static void main() {

        int x = 5 ; // 정수형 변수 xdp 숫자 5를 대입/할당(assign)해 주세요.

        System.out.println("x : " + x);

        //x = 3 ;// overwrite 숫자 3 덮어쓰기.
        x += 3 ; // 누적해서 대입.

        System.out.println("x : " + x);

        x *= 4;
        System.out.println("x : " + x);

        x *= 4;
        System.out.println("x : " + x);

        x %= 5;
        System.out.println("x : " + x);


    }
}
