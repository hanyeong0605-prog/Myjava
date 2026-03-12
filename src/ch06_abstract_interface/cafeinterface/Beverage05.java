package ch06_abstract_interface.cafeinterface;

//추상 메소드를 포함하는 클래스는 반드시 추상 클래스이어야 합니다.
public abstract class Beverage05 { // 추상 메소드임.

    //static이 붙어있으면 멤버 메소드.
    // 카페 이름은 객체 생성하지 않아도 접근이 가능하도록 하는 것이 좋겠습니다.
    public static  String STORE_NAME = "메가MGC커피"; /// final이 붙어있으면 편집 불가능한 상수(constant)입니다.

    private static  int beverageCount = 0; // 주문한 커피 잔수  private라서 접근이 안되니까 (static이어도) get이던 private지워주돈
    //해야되는데 메소드 만들어준대

    public static int getBeverageCount(){

        return beverageCount;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    //모든 음료는 마십니다.
    //추상 메소드는 바디({...}) 를 가질 수 없습니다.
    public abstract void drink(); // 추상메서드, 각각 자식 클래스에서 알아서 활용해


    @Override
    public String toString() {
        return "Beverage05{음료 이름" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Beverage05() {

    }

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;

        beverageCount++; // 커피 잔수 + 1
    }

//    public void showinfo() {
//        System.out.println("음료 이름 : "+name);
//        System.out.println("가격 : "+price);
//    }

}
