package ch04_class;

public class Product03 {
    public String name ; // null 기본값
    //상품의 단가가 입력되지 않으면 500원 이라고 가정합니다.
    private int price = 500; // 0 기본값
    private String inputdate; // null 기본값

    int total;


    //★기본 생성자 : 눈에 보이지 않음.
    //정의 : 객체 생성시 오직 1번만 호출이 되는 특수한 메서드

    //생성자 만들기
    //반환 타입 메소드 이름(매개변수 리스트) {...}  >>>>메소드 만드는거.
    //생성자는 void타입으로도 선언해주지 않음.
   public Product03() {   // 얘는 사용 안되었음.
        System.out.println("하하하");
       System.out.println("하하하하");
       System.out.println("하하하하하");


    }

    public Product03(String name, int price, String inputdate) {
        this.name = name;
        this.price = price;
        this.inputdate = inputdate;
        //객체 자신(this)이 소유한 name 변수에 매개 변수 name의 값을 할당하시오.

    }


    public void display() {
        System.out.println("상품명 : "+ name);
        System.out.println("단가 : "+ price);
        System.out.println("입고 : "+ inputdate);
    }

    //-------------------짜파게티-------------------------//

    public Product03(String name, String inputdate) {    //아까 신라면 생성자에다가 매개변수 새로 오버로딩해라~~~
       this.name = name;

       this.inputdate = inputdate;
    }

    public int practice(int x) {

        for (int i = 0; i < 11 ; i++) {
            total = total + i;

        }
            return total;
    }



}





