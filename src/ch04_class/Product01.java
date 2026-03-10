package ch04_class; // 프로덕트의 설계도. 상품은 무엇인가의 정의
// 실제 실행코드는 들어가면 안돼~

public class Product01 {  // 단계 클래스 정의.
    //개발자가 만드는 새로운 타입.
    //멤버 변수.
    String name ;// 상품명 + String 도 사실은 클래스명임.(그래서 대문자)
    int price; // 단가
    String inputdate; // 입고 일자
//여기에 있는 변수 세개를 Product의 멤버변수라고 부름.

    // 정수 1개를 입력 받아서 +5 를 수행하고 값을 반환합니다.
    //매개변수는 메소드 외부에서 넣어 주는 값입니다.
    // 반환타입 메소드 이름(매개변수리스트){...}
    //메소드는 행위 동작 함수 기능
    int plus5(int x){
        // x는 매개변수. Plus5는 메소드명. int 는 반환타입
       return x + 5;
    }

    // 상품명 : 신라면, 단가 : 1000원, 입고 : 2026/03/01

    String showdata() {  // 매개변수 0개 (괄호안), String반환타입, 메소드명 showdata
        String result = "상품명 : "+ name +" 단가 :"+ 12345+"원, 입고 :" + 2026/03/111;
                return result ;
    }

    void Display() {   // 흑백인 이유는 메소드를 정의만 하고 호출되지 않음.
        System.out.println("상품명 : " + name);
        System.out.println("단가 : " + price);
        System.out.println("입고 : " + inputdate);

    }




}
