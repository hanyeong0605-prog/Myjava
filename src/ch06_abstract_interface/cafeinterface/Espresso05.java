package ch06_abstract_interface.cafeinterface;

public class Espresso05 extends Beverage05 implements ShotAddable {

    private int shotCount;

    @Override
    public void AddShot(int count) {
        this.shotCount += count;
        System.out.println("샷 추가 : "+count);
        System.out.println("샷이"+this.shotCount+"개로 추가되었습니다.");
    }

    @Override//이게 추상 메소드 강제로 상속 가불기 당한거.
    public void drink() {
        System.out.println("샷의 개수가"+shotCount+"인"+super.getName()+"을 진하게 한모금 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nshotCount=" + shotCount +
                '}';

    }
        public Espresso05(String name, double price, int shotCount) {
            super(name, price);
            this.shotCount = shotCount;
        }


    }

