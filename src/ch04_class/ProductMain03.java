package ch04_class;

public class ProductMain03 {
    static void main(String[] args) {
        //클래스 이름 객체 이름 = new 생성자이름
        //생성자 : 객체가 메모리에 생성되는데 "딱 한번만 호출이 되는
        //특수 형태의 메서드"
        Product03 shin = new Product03("신라면", 1000, "2026/03/01");

        shin.display();

        Product03 blackbean = new Product03("짜파게티", "2026/03/10");

        blackbean.display();


        Product03 banana = new Product03();
                banana.display();


        int size = 2; // 상품 2개
        System.out.println("상품 " + size + "를 배열로 다뤄 봅니다.");
        int[] arr = new int[3] ;  // 정수를 다루기 위한 정수 데이터 3개짜리 배열 생성.

        // 배열 정의
        Product03[] itemlist = new Product03[size];


        // 0 번째 객체 생성.
        itemlist[0] = new Product03("소이조이", 2000, "");
        // 1 번째 객체 생성.
        itemlist[1] = new Product03("맥심커피", "2025/07/17");

        for (int i = 0; i < itemlist.length ; i++) {

            System.out.println((i+1) + "번째 상품 정보 : ");
            itemlist[i].display();

        }
        System.out.println("-----------------------------------------------------------");
        Product03[] productArray = {

                new Product03("쭈쭈바", 1500, "2025/12/25"),
                new Product03("사과", 3000, "2025/06/06"),
                new Product03("오징어댕공","2025/07/17")

        };
        for (int i = 0; i < productArray.length; i++) {
            System.out.println((i+1)+"번째 상품 정보 : ");
            productArray[i].display();

        }







        int result = shin.practice(1);
        System.out.println(result);




    }
}
