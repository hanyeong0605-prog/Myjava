package ch06_abstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkChange {

    private String selectMilk;

    @Override
    public void changeMilk(String milkType) {
        System.out.println(this.getName()+" 에 추가할 우유의 종류 : "+milkType);  //순서 중요. 먼저 바꾸고 내려가면 원래값 대입되어서 중복될듯.
        System.out.println("우유의 종류를" +this.selectMilk+"에서"+milkType+"으로 변경하였습니다. ");
        this.selectMilk = milkType;




    }

    @Override//이게 추상 메소드 강제로 상속 가불기 당한거.
    public void drink() {
        System.out.println("우유의 종류가"+selectMilk+"인"+super.getName()+"를 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString()+ "\nLatte05{" +
                "selectMilk='" + selectMilk + '\'' +
                '}';
    }

    public Latte05(String name, double price, String selectMilk) {
        super(name, price);
        this.selectMilk = selectMilk;
    }





    }

