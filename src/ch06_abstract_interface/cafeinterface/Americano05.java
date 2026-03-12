package ch06_abstract_interface.cafeinterface;

import ch05_heritance.mybeverage.Americano04;

public class Americano05 extends Beverage05 implements WaterAdjustable {

    private double waterAmount;



    @Override
    public void adjustWater(double amount) {
        this.waterAmount += amount;             //이거는 인터페이스를(추상메소드&클래스) 강제로 오버라이딩 해줘야하는거
        System.out.println("물 추가 : "+amount+"ml");
        System.out.println("현재 물의 양 : "+this.waterAmount+"ml");
    }

    @Override  //이게 추상 메소드 강제로 상속 가불기 당한거. 추상 메소드를 구체화한 메소드입니다.
    public void drink() {
        System.out.println("물의 양이"+waterAmount+"ml인"+super.getName()+"를 뜨거운 물과 함께 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString()+"\nAmericano05{" +
                "waterAmount=" + waterAmount +
                '}';
    }



    public Americano05(String name, double price, double waterAmount) {  //자식이 부모에게 정보 다 넘겨줘야되니까.
        super(name, price);
        this.waterAmount = waterAmount; // 이야 기똥차네 ALT INSERT
    }
}
