package ch05_heritance.mybeverage;
    public class Espresso04 extends Beverage04 {

        private int shotCount; //샷 추가 갯수

        public Espresso04(String name, double price, int shotCount) {
            super(name, price);
            this.shotCount = shotCount;
//-------------------------------------------------------------------//
        }
        public  void drinkEspresso () {
            String message = "투입할 샷의 개수는" + shotCount + "개 입니다.\n";
            System.out.println(message);
        }

        @Override
        public String toString() {
            String imsi = ", 샷의 수는 : " + shotCount;
            return super.toString() + imsi;
        }
    }
