package ch05_heritance.general;
//4개 클래스 중 가장 대표가 될 수 있는 클래스가 super클래스.
public class Beverage03 {
    /*
    서브 클래스가 수퍼 클래스의 변수에 접근
    1. private은 getter/setter로 접근
    2. private대신에 protected로 작성하기
    3. 생성자를 통한 대입
    */


        private String name; //음료 이름
        private double price; //단가

        public Beverage03() {} //기본형태. 기본 생성자를 만들어줘야 다른 빈곳의
    //클래스들에서 문제가 안생겨.

        public Beverage03(String name, double price) {
                this.name = name;
                this.price = price;
        }

        protected void showInfo() {
            System.out.println("음료 이름 : " + name);
            System.out.println("단가 : " +price);

        }


}
