package Review;

public class WashingMachine extends Appliance {

    int capacity;
    @Override
    public void showinfo() {

        super.showinfo();
        System.out.println("용량 : " + super.power);
    }

    @Override
    public void wash() {

        System.out.println(super.name+"기기가 세탁을 시작합니다.");
    }
}


