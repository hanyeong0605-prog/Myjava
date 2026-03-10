package Review;

public class Appliance {

    String name;
    int elec;
    int power;

    public void working() {
        System.out.println(name + "세탁기가 세탁을 시작합니다.");

    }
    public void showinfo() {
        System.out.println("브랜드 : "+name);
        System.out.println("전력 : "+elec);
        //System.out.println("용량 : "+power);
    }


    public void wash() {

    }

}
