package ch06_abstract_interface.cafeinterface;

public class SpecialCoffee05 extends Beverage05 implements WaterAdjustable, ShotAddable, MilkChange {

    private double waterAmount;
    private int shotCount;
    private String selectMilk;

    public SpecialCoffee05(String name, double price, double waterAmount, int shotCount, String selectMilk) {
        super(name, price);
        this.waterAmount = waterAmount;
        this.shotCount = shotCount;
        this.selectMilk = selectMilk;
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + "을(를) 마십니다.");
    }

    @Override
    public void adjustWater(double amount) {
        this.waterAmount += amount;
        System.out.println("물" + amount +"ml를 추가하여" + waterAmount+"ml 입니다.");

    }

    @Override
    public void AddShot(int count) {
        System.out.println("샷이  " +count +"개 추가되어" + shotCount+"개입니다.");
        this.shotCount = count;

    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("타입 변경 이전 :" + this.selectMilk +"이후 : "+ milkType);
        this.selectMilk = milkType;

    }
}
