package Poketmonster02;

public class Attack02 extends Poketmonster02 {
   private double attack ;
   private double[] skill1_atk={20, 100};
   private int skill1number;
   private  static  String[] skill1name = {
            "몸통박치기" ,"백만볼트"
    };

    public Attack02(String name,String Type, double attack) {
        super(name,Type);
        this.attack = attack;
    }
}
