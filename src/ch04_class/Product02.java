package ch04_class;

public class Product02 {
    //static는 모든 객체들이 공유할 목적으로 사용되는 변수입니다.
    //클래스 이름으로 접근이 가능하여 '클래스 변수'라고 부릅니다.
  static  String brand ; // 브랜드 (스태틱 변수 = 클래스 변수)


 // 멤버 변수는 타입별로 기본 값이 있습니다.
    // 문자열(null)(String에 값을 안넣어주면), 정수(0), 실수 (0.0)
    private String name; // 상품명
    private int price; // 단가 >> private으로 선언해서 참조 불가.
    String inputdate; // 입고 일자

    public String getName () {
        return name;
    }

    public void setPrice(int price) {  // int price는 매개변수.
        // 매개변수는 지역 변수의 부분집합입니다.

        this.price = price;

    }


    public int getPrice() {  //앞에 접근 지정자를 일반적으로 붙임.
        return price;
    }  // 이 형태가 getter메소드

    public void setName(String name) {


        this.name = name;  //shin.name이 되는 격


    }

}


