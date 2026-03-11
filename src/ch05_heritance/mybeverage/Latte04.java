package ch05_heritance.mybeverage;
public class Latte04 extends Beverage04 {

    public String milk; // 우유 타입

    public Latte04(String name, double price, String milk) {
        super(name, price);
        this.milk = milk;
    }
//-------------------------------------------------------------------//
    public void selectmilk () {
       String message = "부드럽고 크리미한 %s를 마십니다.\n";
        System.out.printf(message,milk + super.getName());
        System.out.println();
    }

    @Override
    public String toString() {
        String imsi = ", 라떼의 재료는 : " + milk;

        return super.toString()+imsi;
    }
}
