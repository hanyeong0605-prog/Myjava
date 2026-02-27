package ch01_variable_operator;



public class Add {
    static void main() {
        // 3 더하기 5는 8 입니다..
        // 변수 정의 (변수 선언)
        int x ; // 정수형 데이터를 위하여 x를 준비하세요.
        int y ;

        int result;
        int mul;
        

        // 변수의 값을 할당(대입)
        x = 3; // 쓰기 (대입, 할당)
        y = 5; // 쓰기
        result = x + y; // + 기호 덧셈   읽은 값을 쓰기.

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("result = " + result);
        // 3 더하기 5는 8입니다.
        System.out.println(x + " 더하기 " + y + " 는 " + result + " 입니다 " );


        x = 4; // 새로운 x값 overwrite
        y = 8;
        mul = x * y;

        System.out.println(x + " 곱하기 " + y + " 는 "+  mul + " 입니다 ");
        

    }
}
