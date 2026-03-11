package ch05_heritance.general;

public class Latte03 extends Beverage03 {

    public String milk; // 우유 타입

    public Latte03(String name, double price, String milk) {
        super(name, price);
        this.milk = milk;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("우유의 종류는 :" + milk + "입니다.");
    }


}
