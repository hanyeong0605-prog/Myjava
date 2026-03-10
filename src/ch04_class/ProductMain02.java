package ch04_class;

public class ProductMain02 {
    static void main(String[] args) {

        Product02. brand = "농심"; // f밑에 다이아몬드 기호 생기면 static변수 기호.


        Product02 blackbean = new Product02();

        Product02 shin = new Product02(); //shin은 메인 메소드 중괄호 사이에 들어있어서
        //메인 메소드 내의 지역변수임.



        shin.setName("신라면"); // 직접쓰기

       // shin.getName();

        System.out.println(shin.brand);

        shin.brand = "nongsim"; // shin.brand와

        System.out.println(blackbean.brand); // blackbeam.brand
        //둘 다 static으로 인해 모든 상품은 동일한 브랜드를 가진다는 가정이 됨.
        // 똑같이 nongsim으로 출력됨. static을 쓰면 new을 새로 해줘도 메모리에 하나만 저장됨.



         shin.setPrice(1000); //단가를 바꾸기 위함 ( setter 쓰기 )  // 간접쓰기.
        shin.inputdate = "2026/03/01";
        shin.getPrice();

        System.out.println(shin.brand);



        System.out.println("상품 명: "+shin.getName());
        System.out.println("단가 : "+shin.getPrice());
        System.out.println("단가 : "+shin.inputdate);


        for (int i = 0; i < 10; i++) {


        }

        for (int i = 0; i < 20; i++) {

        }



    }
}
