package Review;

public class ApplianceMain {
    public static void main(String[] args) {

        WashingMachine wash = new WashingMachine();
        wash.name = "LG";
        wash.elec = 2000;
        wash.power = 21;


        wash.showinfo();
        wash.wash();

        Refrigerator ref = new Refrigerator();
        ref.name = "samsung";
        ref.elec = 500;
        ref.issmart = false;
        ref.showinfo();






    }
}
