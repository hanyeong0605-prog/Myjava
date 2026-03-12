package ch06_abstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements MilkAddable,WaterAdjustable {

    private String milkType;
    private double foamAmount; // 거품량

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void drink() {

    }

    @Override
    public void addmilk(String milkkind) {
        System.out.println(this.getName()+ "에 넣을 우유의 종류 : "+milkkind+"입니다.");

    }

    @Override
    public void addfoam(double foamamount) {
        System.out.println(this.getName()+ "에 넣을 폼의 양은"+foamamount);
        System.out.println("폼이"+foamAmount+"에서"+foamamount+"만큼 추가되었습니다.");
        this.foamAmount += foamamount;


    }

    public Cappuccino05(String name, double price, String milkType, double foamAmount){
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }

    @Override
    public void adjustWater(double amount) {
        this.foamAmount =amount;

    }
}
