package ch05_heritance.mybeverage;

public class Beverage04 {

    private String name; //음료 이름
    private double price; //단가



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public Beverage04() {} //기본형태. 기본 생성자를 만들어줘야 다른 빈곳의
    //클래스들에서 문제가 안생겨.

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " +price);

    }
//----------------------------------------------------------------------------//
    @Override  // object에 있는 내용 오버라이딩 해.
    public String toString() {
        String imsi = "상품명 : "+name + ", 단가 : " + price;//임시 변수 생성.
        //return super.toString() +"\n"+imsi;
        return imsi;
    }




}
