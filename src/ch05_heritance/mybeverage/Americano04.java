package ch05_heritance.mybeverage;
    public class Americano04 extends Beverage04 {

        public double waterAmount; //투입하는 물의 양
        //생성자 >> 멤버 변수 초기화

        public Americano04(String name, double price, double waterAmount) {

            // 서브 클래스의 생성자의 첫 줄에는 super(); 라는 단어가 숨어있다.
            // super()는 매개변수가 0개인 super클래스의 생성자. 서브 클래스에만 있음.
            // 사용자가 super(매개변수); 이것을 다시 작성하면, super()는 사라짐.(안보이던 기본super)
            super(name, price);  // 생성자를 통하여 데이터를 super클래스에 넘겨줍니다.
            this.waterAmount = waterAmount;   // 이 클래스 내에 waterAmount를 선언해줌.
            //근데 값을 넣어준건 InheTest니까 this.waterAmount로 값 가져와
        }

        //-------------------------------------------------------------------//
            //sip:홀짝홀짝 마시다
            public void sipAmericano(){
                String message = super.getName() + "를 홀짝홀짝 마십니다.";
                System.out.println(message);
            }

        @Override  // Beverage04에 있는 toString()메서드가 object에서 오버라이드된걸
        //서브클래스에서 다시 오버라이드하기.
        public String toString() {
            String imsi = ", 물의 양 : " + waterAmount;
            return super.toString() + imsi;// 이거 없으면 상위 Beverage04클래스의
            //오버라이딩 했던 메서드가 적용이 안되는듯.
        }

        //        }
//
//        public void printInfo() {
//            super.showInfo();
//            System.out.println("투입된 물의 량 : " + waterAmount + "ml");
//        }
        }



